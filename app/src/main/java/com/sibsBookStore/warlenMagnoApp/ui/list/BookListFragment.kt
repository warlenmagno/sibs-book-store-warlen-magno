package com.sibsBookStore.warlenMagnoApp.ui.list

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.paging.LoadState
import com.github.ajalt.timberkt.Timber
import com.sibsBookStore.warlenMagnoApp.R
import com.sibsBookStore.warlenMagnoApp.databinding.BookListFragmentBinding
import com.sibsBookStore.warlenMagnoApp.model.Book
import com.sibsBookStore.warlenMagnoApp.ui.list.adapter.BookListAdapter
import com.sibsBookStore.warlenMagnoApp.ui.list.adapter.LoadingGridStateAdapter
import com.sibsBookStore.warlenMagnoApp.util.AppConstants
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class BookListFragment : Fragment(), BookListAdapter.Callbacks {

    companion object {
        fun newInstance() = BookListFragment()
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: BookListViewModel
    lateinit var mBinding: BookListFragmentBinding

    @Inject
    lateinit var mAdapter: BookListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.book_list_fragment, container, false)
        return mBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        AndroidSupportInjection.inject(this)
        viewModel =
            ViewModelProvider(this, this.viewModelFactory).get(BookListViewModel::class.java)
        mBinding.viewModel = viewModel
        mBinding.lifecycleOwner = this
        viewModel.getBookList()

        observeEvents()
        setupForAdapter()
    }

    private fun observeEvents() {

        viewModel.error.observe(viewLifecycleOwner, Observer {
            Timber.e { "Error $it" }
            Toast.makeText(activity, "Error $it", Toast.LENGTH_SHORT).show()
        })

        viewModel.bookList.observe(viewLifecycleOwner, Observer {
            mAdapter.submitData(lifecycle, it)

        })

    }

    private fun setupForAdapter() {
        mAdapter.setupListener(this)
        mBinding.rvBooks.adapter = mAdapter
        mBinding.rvBooks.adapter = mAdapter.withLoadStateFooter(
            footer = LoadingGridStateAdapter()
        )
        mAdapter.addLoadStateListener { loadState ->
            val errorState = loadState.source.append as? LoadState.Error
                ?: loadState.source.prepend as? LoadState.Error
                ?: loadState.append as? LoadState.Error
                ?: loadState.prepend as? LoadState.Error

            errorState?.let {
                AlertDialog.Builder(view?.context)
                    .setTitle(R.string.txt_error)
                    .setMessage(it.error.localizedMessage)
                    .setNegativeButton(R.string.txt_cancel) { dialog, _ ->
                        dialog.dismiss()
                    }
                    .setPositiveButton(R.string.txt_retry) { _, _ ->
                        mAdapter.retry()
                    }
                    .show()
            }
        }

        mBinding.lySwipeRefresh.setProgressViewOffset(false, mBinding.root.height / 2, 500)
    }


    override fun onBookItemClick(view: View, item: Book) {
        Timber.d { "clicked on book" }
        val bundle = Bundle()
        bundle.putParcelable(AppConstants.BOOK_ARGU, item)
        findNavController().navigate(R.id.action_bookListFragment_to_bookDetailFragment, bundle)
    }
}