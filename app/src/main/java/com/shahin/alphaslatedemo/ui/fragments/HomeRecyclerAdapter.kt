package com.shahin.alphaslatedemo.ui.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
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
        val id = home_list[position].id
        val desc = home_list[position].desc

        holder.desc.text = desc
        holder.image.setImageResource(id)


    }

    override fun getItemCount(): Int {
        return home_list.size
    }

    inner class ViewHolder(private val mView: View) : RecyclerView.ViewHolder(mView) {
        val desc: TextView
        val image: ImageView

        init {
            desc = mView.findViewById(R.id.item_desc)
            image = mView.findViewById(R.id.item_image)
        }
    }
}
