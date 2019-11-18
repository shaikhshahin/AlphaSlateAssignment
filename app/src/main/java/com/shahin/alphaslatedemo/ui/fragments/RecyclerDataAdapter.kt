package com.shahin.alphaslatedemo.ui.fragments

import android.content.Context
import android.os.Build
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi

import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

import com.shahin.alphaslatedemo.R

import java.util.ArrayList

class RecyclerDataAdapter(private val dummyParentDataItems: ArrayList<HomeParentDataItem>) :
    RecyclerView.Adapter<RecyclerDataAdapter.MyViewHolder>() {

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerDataAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.expandable_child_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerDataAdapter.MyViewHolder, position: Int) {
        val dummyParentDataItem = dummyParentDataItems[position]
        holder.textView_parentName.text = dummyParentDataItem.parentName
        var status : String? = dummyParentDataItem.status

        holder.date.text= dummyParentDataItem.date
        holder.time.text=dummyParentDataItem.time

        if(status.equals("completed")){
            holder.status.setBackgroundResource(R.drawable.greenrectangle)
            holder.status.text= "Completed"
        }else if(status.equals("progress")){
            holder.status.setBackgroundResource(R.drawable.yellowrectangle)
            holder.status.text= "In Progress"

        }else{
            holder.status.setBackgroundResource(R.drawable.redrectangle)
            holder.status.text= "Pending"


        }
        //
        val noOfChildTextViews = holder.linearLayout_childItems.childCount
        for (index in 0 until noOfChildTextViews) {
            val currentTextView = holder.linearLayout_childItems.getChildAt(index) as TextView
            currentTextView.visibility = View.VISIBLE
        }

        val noOfChild = dummyParentDataItem.childDataItems?.size
        if (noOfChild != null) {
            if (noOfChild < noOfChildTextViews) {
                if (noOfChild != null) {
                    for (index in noOfChild until noOfChildTextViews) {
                        val currentTextView = holder.linearLayout_childItems.getChildAt(index) as TextView
                        currentTextView.visibility = View.GONE
                    }
                }
            }
        }
        for (textViewIndex in 0 until noOfChild!!) {
            val currentTextView =
                holder.linearLayout_childItems.getChildAt(textViewIndex) as TextView
            currentTextView.text = dummyParentDataItem.childDataItems?.get(textViewIndex)?.childName
            /*currentTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(mContext, "" + ((TextView) view).getText().toString(), Toast.LENGTH_SHORT).show();
                    }
                });*/
        }
    }

    override fun getItemCount(): Int {
        return dummyParentDataItems.size
    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        private val context: Context
        val textView_parentName: TextView
        val linearLayout_childItems: LinearLayout
        val status: TextView
        val date: TextView

        val time: TextView



        init {
            context = itemView.context
            textView_parentName = itemView.findViewById(R.id.parent_item)
            linearLayout_childItems = itemView.findViewById(R.id.ll_child_items)
            linearLayout_childItems.visibility = View.GONE
            status = itemView.findViewById(R.id.item_progress)
            date = itemView.findViewById(R.id.item_date)
            time = itemView.findViewById(R.id.item_time)


            var intMaxNoOfChild = 0
            for (index in dummyParentDataItems.indices) {
                val intMaxSizeTemp = dummyParentDataItems[index].childDataItems?.size
                if (intMaxSizeTemp != null) {
                    if (intMaxSizeTemp > intMaxNoOfChild) intMaxNoOfChild = intMaxSizeTemp!!
                }
            }
            for (indexView in 0 until intMaxNoOfChild) {
                val textView = TextView(context)
                textView.id = indexView
                textView.setPadding(20, 20, 20, 20)
                textView.gravity = Gravity.LEFT
                textView.background = ContextCompat.getDrawable(context, R.drawable.yellowrectangle)
                val layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                textView.setOnClickListener(this)
                linearLayout_childItems.addView(textView, layoutParams)
            }
            textView_parentName.setOnClickListener(this)
        }

        override fun onClick(view: View) {
            if (view.id == R.id.parent_item) {
                if (linearLayout_childItems.visibility == View.VISIBLE) {
                    linearLayout_childItems.visibility = View.GONE
                } else {
                    linearLayout_childItems.visibility = View.VISIBLE
                }
            } else {
                val textViewClicked = view as TextView
                Toast.makeText(context, "" + textViewClicked.text.toString(), Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}
