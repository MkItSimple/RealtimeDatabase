package com.example.realtimedatabase.ui

import android.view.View
import com.example.realtimedatabase.data.Author

interface RecyclerViewClickListener {
    fun onRecyclerViewItemClicked(view: View, author: Author)
}