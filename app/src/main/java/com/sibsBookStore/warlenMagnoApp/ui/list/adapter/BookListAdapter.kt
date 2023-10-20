package com.sibsBookStore.warlenMagnoApp.ui.list.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.sibsBookStore.warlenMagnoApp.R
import com.sibsBookStore.warlenMagnoApp.databinding.SingleItemBookBinding
import com.sibsBookStore.warlenMagnoApp.model.Book

class BookListAdapter : PagingDataAdapter<Book, BookListAdapter.ViewHolder>(COMPARATOR) {

    private var callbacks: Callbacks? = null
    fun setupListener(listener: Callbacks?) {
        this.callbacks = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: SingleItemBookBinding =
            DataBindingUtil.inflate(inflater, R.layout.single_item_book, parent, false)
        return ViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        getItem(position)?.let {
            holder.bind(it)
        }
    }

    interface Callbacks {
        fun onBookItemClick(view: View, item: Book)
    }

    inner class ViewHolder(val binding: SingleItemBookBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(book: Book) {
            binding.apply {
                palette = txtTitle
                binding.item = book
                lyMovieItem.setOnClickListener {
                    callbacks?.onBookItemClick(it, book)
                }
                executePendingBindings()
            }

        }
    }

    object COMPARATOR : DiffUtil.ItemCallback<Book>() {
        override fun areItemsTheSame(oldItem: Book, newItem: Book): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Book, newItem: Book): Boolean {
            return oldItem == newItem
        }
    }

}