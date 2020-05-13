package com.example.historyrecycerview.utils

import com.example.historyrecycerview.model.HeaderItem
import com.example.historyrecycerview.model.HistoryItem
import com.example.historyrecycerview.model.TimelineItem

object DataSource {

    fun getTimelineData():List<TimelineItem> {
        val mdata = ArrayList<TimelineItem>()

        val itemHeader = HeaderItem(10000)
        val headerTimelineItem = TimelineItem(itemHeader)
        val historyTimelineItemTop = TimelineItem(HistoryItem("top", BG_HISTORY.BG_HISTORY_TOP))
        val historyTimelineItemCenter = TimelineItem(HistoryItem("center",BG_HISTORY.BG_HISTORY_CENTER))
        val historyTimelineItemBottom = TimelineItem(HistoryItem("bottom",BG_HISTORY.BG_HISTORY_BOTTOM))
        val historyTimelineItemNone = TimelineItem(HistoryItem("none",BG_HISTORY.BG_HISTORY_NONE))

        mdata.add(headerTimelineItem)
        mdata.add(historyTimelineItemTop)
        mdata.add(historyTimelineItemNone)
        mdata.add(historyTimelineItemBottom)
        mdata.add(headerTimelineItem)
        mdata.add(historyTimelineItemCenter)
        mdata.add(headerTimelineItem)
        mdata.add(historyTimelineItemTop)
        mdata.add(historyTimelineItemBottom)

        return mdata
    }

}