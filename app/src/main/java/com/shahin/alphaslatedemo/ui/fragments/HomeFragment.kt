package com.shahin.alphaslatedemo.ui.fragments


import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.shahin.alphaslatedemo.R

import java.util.ArrayList


class HomeFragment : Fragment() {

    private var rv_list: MutableList<HomeItem>? = null
    private var recyclerView: RecyclerView? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView = view.findViewById<View>(R.id.home_rv) as RecyclerView

        recyclerView!!.layoutManager = LinearLayoutManager(activity)

        rv_list = ArrayList()
        rv_list!!.add(
            HomeItem(
                "Maths(CBSC)",
                "244 Hours",
                "24-10-2019",
                "Grade 7"

            )
        )
        rv_list!!.add(
            HomeItem(
                "Maths(ICSC)",
                "244 Hours",
                "24-10-2019",
                "Grade 7"

            )
        )
        rv_list!!.add(
            HomeItem(
                "Maths(HSC)",
                "244 Hours",
                "24-10-2019",
                "Grade 7"

            )
        )
        rv_list!!.add(
            HomeItem(
                "Maths(CBSC)",
                "244 Hours",
                "24-10-2019",
                "Grade 7"


            )
        )
        rv_list!!.add(
            HomeItem(
                "Maths(ICSC)",
                "244 Hours",
                "24-10-2019",
                "Grade 7"


            )
        )
        rv_list!!.add(
            HomeItem(
                "Maths(HSC)",
                "244 Hours",
                "24-10-2019",
                "Grade 7"


            )
        )


        val mAdapter =
            HomeRecyclerAdapter(rv_list as ArrayList<HomeItem>)

        recyclerView!!.adapter = mAdapter

        recyclerView!!.itemAnimator = DefaultItemAnimator()

        return view
    }


}// Required empty public constructor
