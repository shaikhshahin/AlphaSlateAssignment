package com.shahin.alphaslatedemo.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.shahin.alphaslatedemo.R

class ExamPlanner : Fragment() {

    lateinit var countTv: TextView
    lateinit var countBtn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)
        countTv = view.findViewById<View>(R.id.count_tv) as TextView
        countTv.text = "0"
        countBtn = view.findViewById<View>(R.id.count_btn) as Button
        countBtn.setOnClickListener { increaseCount() }
        return view
    }

    private fun increaseCount() {
        val current = Integer.parseInt(countTv.text as String)
        countTv.text = (current + 1).toString()

    }

}// Required empty public constructor
