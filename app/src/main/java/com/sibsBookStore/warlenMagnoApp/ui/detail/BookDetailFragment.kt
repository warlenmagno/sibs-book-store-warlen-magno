package com.sibsBookStore.warlenMagnoApp.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.sibsBookStore.warlenMagnoApp.R
import com.sibsBookStore.warlenMagnoApp.databinding.BookDetailFragmentBinding
import com.sibsBookStore.warlenMagnoApp.model.Book
import com.sibsBookStore.warlenMagnoApp.util.AppConstants
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class BookDetailFragment : Fragment() {

    companion object {
        fun newInstance() = BookDetailFragment()
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var mBinding: BookDetailFragmentBinding
    private lateinit var viewModel: BookDetailViewModel
    lateinit var book: Book

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        book = arguments?.getParcelable(AppConstants.BOOK_ARGU)!!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        mBinding =
            DataBindingUtil.inflate(inflater, R.layout.book_detail_fragment, container, false)
        mBinding.toolbar.setTitleTextColor(resources.getColor(R.color.white))
        return mBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        AndroidSupportInjection.inject(this)
        viewModel =
            ViewModelProvider(this, this.viewModelFactory).get(BookDetailViewModel::class.java)
        mBinding.viewModel = viewModel
        mBinding.lifecycleOwner = this
        viewModel.bookId.value = book.id
        viewModel.bookDetail(book)
        mBinding.lyMovieDetail.btnBookMovie.isVisible = book.buyPath?.isEmpty() == false
        //TODO change it later
        mBinding.lyMovieDetail.btnBookMovie.setOnClickListener {
            clickOnBookMovie()
        }
    }


    private fun clickOnBookMovie(){
        val bundle = Bundle()
        bundle.putString(AppConstants.URL_ARGU, book.buyPath)
        findNavController().navigate(R.id.action_movieDetailFragment_to_webViewFragment, bundle)
    }

}