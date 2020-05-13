package com.example.historyrecycerview.adapters

import android.view.View
import com.example.historyrecycerview.R
import com.example.historyrecycerview.model.TimelineItem
import com.example.historyrecycerview.utils.BG_HISTORY
import com.example.historyrecycerview.utils.BG_HISTORY.*
import kotlinx.android.synthetic.main.item_history.view.*


class HistoryViewHolder(itemView: View, bgType: BG_HISTORY = BG_HISTORY_NONE) : BaseViewHolder(itemView) {

    init {
        when(bgType){
            BG_HISTORY_TOP -> itemView.setBackgroundResource(R.drawable.border_top)
            BG_HISTORY_CENTER-> itemView.setBackgroundResource(R.drawable.border_bg)
            BG_HISTORY_BOTTOM-> itemView.setBackgroundResource(R.drawable.border_bottom)
            BG_HISTORY_NONE-> itemView.setBackgroundResource(R.color.colorAccent)
        }
    }

    override fun setData(item: TimelineItem) {
        val historyItem = item.historyItem
        itemView.tvHistory.text = historyItem.title
    }



}