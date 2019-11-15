package com.shahin.alphaslatedemo.ui.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import com.shahin.alphaslatedemo.R


class HomeRecyclerAdapter(var home_list: List<HomeItem>) :
    RecyclerView.Adapter<HomeRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val title = home_list[position].title
        val time = home_list[position].time
        val date = home_list[position].date
        val grade = home_list[position].grade


        holder.title.text = title
        holder.time.text = time
        holder.date.text = date
        holder.grade.text = grade


    }

    override fun getItemCount(): Int {
        return home_list.size
    }

    inner class ViewHolder(private val mView: View) : RecyclerView.ViewHolder(mView) {
        val title: TextView
        val time: TextView
        val grade: TextView

        val date: TextView

        init {
            title = mView.findViewById(R.id.item_title)
            time = mView.findViewById(R.id.item_time)
            date = mView.findViewById(R.id.item_date)
            grade = mView.findViewById(R.id.item_grade)

        }
    }
}
