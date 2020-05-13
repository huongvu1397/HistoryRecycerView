package com.example.historyrecycerview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.historyrecycerview.R
import com.example.historyrecycerview.model.TimelineItem
import com.example.historyrecycerview.utils.BG_HISTORY.*

class TimelineAdapter : RecyclerView.Adapter<BaseViewHolder>() {

    companion object{
        const val TYPE_ITEM_HEADER = 0
        const val TYPE_ITEM_HISTORY = 1
        const val TYPE_ITEM_HISTORY_NONE = 2
        const val TYPE_ITEM_HISTORY_TOP = 3
        const val TYPE_ITEM_HISTORY_CENTER = 4
        const val TYPE_ITEM_HISTORY_BOTTOM = 5
    }

    var mData : List<TimelineItem> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val view:View
        when(viewType){
            TYPE_ITEM_HEADER ->{
                view = LayoutInflater.from(parent.context).inflate(R.layout.item_header,parent,false)
                return HeaderViewHolder(view)
            }
            TYPE_ITEM_HISTORY_NONE ->{
                view = LayoutInflater.from(parent.context).inflate(R.layout.item_history,parent,false)
                return HistoryViewHolder(view,BG_HISTORY_NONE)
            }
            TYPE_ITEM_HISTORY_TOP ->{
                view = LayoutInflater.from(parent.context).inflate(R.layout.item_history,parent,false)
                return HistoryViewHolder(view, BG_HISTORY_TOP)
            }
            TYPE_ITEM_HISTORY_CENTER->{
                view = LayoutInflater.from(parent.context).inflate(R.layout.item_history,parent,false)
                return HistoryViewHolder(view, BG_HISTORY_CENTER)
            }
            TYPE_ITEM_HISTORY_BOTTOM->{
                view = LayoutInflater.from(parent.context).inflate(R.layout.item_history,parent,false)
                return HistoryViewHolder(view, BG_HISTORY_BOTTOM)
            }
            else -> throw IllegalArgumentException()
        }
    }

    override fun getItemCount(): Int = mData.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.setData(mData[holder.adapterPosition])
    }

    override fun getItemViewType(position: Int): Int {
        return when (mData[position].viewType) {
            TYPE_ITEM_HEADER -> {
                TYPE_ITEM_HEADER
            }
            TYPE_ITEM_HISTORY -> {
                when(mData[position].bgType){
                    BG_HISTORY_NONE -> TYPE_ITEM_HISTORY_NONE
                    BG_HISTORY_TOP -> TYPE_ITEM_HISTORY_TOP
                    BG_HISTORY_CENTER -> TYPE_ITEM_HISTORY_CENTER
                    BG_HISTORY_BOTTOM -> TYPE_ITEM_HISTORY_BOTTOM
                }
            }
            else -> throw IllegalArgumentException()
        }

    }
}