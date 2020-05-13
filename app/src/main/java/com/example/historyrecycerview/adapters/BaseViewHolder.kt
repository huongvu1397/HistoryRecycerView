package com.example.historyrecycerview.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.historyrecycerview.model.TimelineItem

abstract class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    abstract fun setData(item:TimelineItem)

}