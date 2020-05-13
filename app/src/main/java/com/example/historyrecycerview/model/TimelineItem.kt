package com.example.historyrecycerview.model

import com.example.historyrecycerview.adapters.TimelineAdapter
import com.example.historyrecycerview.utils.BG_HISTORY

class TimelineItem {
    lateinit var headerItem :HeaderItem
    lateinit var historyItem :HistoryItem
    var viewType: Int
    var bgType: BG_HISTORY = BG_HISTORY.BG_HISTORY_NONE

    constructor(headerItem: HeaderItem){
        this.headerItem = headerItem
        viewType = TimelineAdapter.TYPE_ITEM_HEADER
    }
    constructor(historyItem:HistoryItem){
        this.historyItem = historyItem
        viewType = TimelineAdapter.TYPE_ITEM_HISTORY
        bgType = historyItem.bgType
    }
}