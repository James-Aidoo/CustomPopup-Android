package com.questdev.custompopupapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class SearchRecyclerAdapter(context: Context, private val data: MutableList<SearchResult>) : RecyclerView.Adapter<SearchRecyclerAdapter.ViewHolder>() {
    private val layoutInflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.search_result_list_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return data.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val resultAtPos = data[position]
        holder.textName.text = resultAtPos.name
        holder.textStatus.text = resultAtPos.status
        holder.imageView.setImageResource(R.drawable.photo)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textName: TextView = itemView.findViewById(R.id.text_name)
        val textStatus: TextView = itemView.findViewById(R.id.text_status)
        val imageView: CircleImageView = itemView.findViewById(R.id.pic)
    }
}