package com.shahin.alphaslatedemo.ui.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import com.shahin.alphaslatedemo.R


/**
 * A simple [Fragment] subclass.
 */
class MyCoursesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_notifications, container, false)
    }

}// Required empty public constructor
