package com.questdev.custompopupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_firebase_search.*

class FirebaseSearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firebase_search)

        setupRecyclerAdapter()
    }

    private fun setupRecyclerAdapter() {
        val data: MutableList<SearchResult> = mutableListOf()
        val sample = SearchResult(resources.getString(R.string.user_name), resources.getString(R.string.user_status))
        for (i in 0..30) {
            data.add(sample)
        }

        val adapter = SearchRecyclerAdapter(this, data)
        result_view.layoutManager = LinearLayoutManager(this)
        result_view.adapter = adapter
    }
}
