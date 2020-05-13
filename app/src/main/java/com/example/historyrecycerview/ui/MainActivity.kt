package com.example.historyrecycerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.historyrecycerview.utils.DataSource
import com.example.historyrecycerview.R
import com.example.historyrecycerview.adapters.TimelineAdapter
import com.example.historyrecycerview.model.TimelineItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var timeLineAdapter : TimelineAdapter ? = null
    private var mData:List<TimelineItem> =  mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getListData()
        setupAdapter()
    }

    private fun setupAdapter() {
        timeLineAdapter = TimelineAdapter().apply {
            mData = this@MainActivity.mData
        }
        rcvHistory.adapter = timeLineAdapter
    }

    private fun getListData(){
        mData = DataSource.getTimelineData()
    }
}
