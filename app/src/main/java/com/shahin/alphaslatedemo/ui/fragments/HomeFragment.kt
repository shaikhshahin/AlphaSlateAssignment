package com.shahin.alphaslatedemo.ui.fragments


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


import java.util.ArrayList
import com.shahin.alphaslatedemo.utility.SwipeControllerActions
import com.shahin.alphaslatedemo.utility.SwipeController
import android.graphics.Canvas
import com.shahin.alphaslatedemo.R
import com.shahin.alphaslatedemo.ui.activity.SettingsActivity
import android.widget.Toast
import android.view.*
import android.view.MenuInflater
import android.view.ContextMenu
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    private var rv_list: MutableList<HomeItem>? = null
    private var recyclerView: RecyclerView? = null
    var swipeController: SwipeController? = null
     lateinit var btnPending: Button
    lateinit var btnProgress: Button

    lateinit var btnCompleted: Button




    @SuppressLint("ResourceAsColor")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)


        btnPending = view.findViewById(R.id.bt_pending)
        btnProgress = view.findViewById(R.id.bt_progress)
        btnCompleted = view.findViewById(R.id.bt_completed)

        btnPending.setOnClickListener {
            // your code to perform when the user clicks on the button
            btnPending.setBackgroundResource(R.drawable.darkred)
            btnPending.setTextColor(R.color.white)


            btnCompleted.setBackgroundResource(R.drawable.greenrectangle)
            btnCompleted.setTextColor(R.color.black)

            btnProgress.setBackgroundResource(R.drawable.yellowrectangle)
            btnProgress.setTextColor(R.color.black)

            rv_list = ArrayList()
            rv_list!!.add(
                HomeItem(
                    "Maths(CBSC)",
                    "244 Hours",
                    "24-10-2019",
                    "Grade 7",
                    "Pending"

                )
            )
            rv_list!!.add(
                HomeItem(
                    "Maths(ICSC)",
                    "244 Hours",
                    "24-10-2019",
                    "Grade 7",
                    "Pending"

                )
            )
            rv_list!!.add(
                HomeItem(
                    "Maths(HSC)",
                    "244 Hours",
                    "24-10-2019",
                    "Grade 7",
                    "Pending"

                )
            )

            val mAdapter =
                HomeRecyclerAdapter(rv_list as ArrayList<HomeItem>)

            recyclerView!!.adapter = mAdapter

            recyclerView!!.itemAnimator = DefaultItemAnimator()


        }

        btnProgress.setOnClickListener {
            // your code to perform when the user clicks on the button
            btnProgress.setBackgroundResource(R.drawable.darkyellow)
            btnProgress.setTextColor(R.color.white)

            btnCompleted.setBackgroundResource(R.drawable.greenrectangle)
            btnCompleted.setTextColor(R.color.black)
            btnPending.setBackgroundResource(R.drawable.redrectangle)
            btnPending.setTextColor(R.color.black)



            rv_list = ArrayList()
            rv_list!!.add(
                HomeItem(
                    "Maths(CBSC)",
                    "244 Hours",
                    "24-10-2019",
                    "Grade 7",
                    "In Progress"

                )
            )
            rv_list!!.add(
                HomeItem(
                    "Maths(ICSC)",
                    "244 Hours",
                    "24-10-2019",
                    "Grade 7",
                    "In Progress"

                )
            )
            rv_list!!.add(
                HomeItem(
                    "Maths(HSC)",
                    "244 Hours",
                    "24-10-2019",
                    "Grade 7",
                    "In Progress"

                )
            )
            rv_list!!.add(
                HomeItem(
                    "Maths(HSC)",
                    "244 Hours",
                    "24-10-2019",
                    "Grade 7",
                    "In Progress"

                )
            )

            val mAdapter =
                HomeRecyclerAdapter(rv_list as ArrayList<HomeItem>)

            recyclerView!!.adapter = mAdapter

            recyclerView!!.itemAnimator = DefaultItemAnimator()


        }
            btnCompleted.setOnClickListener {
                // your code to perform when the user clicks on the button
                btnCompleted.setBackgroundResource(R.drawable.darkgreen)
                btnCompleted.setTextColor(R.color.white)

                btnProgress.setBackgroundResource(R.drawable.yellowrectangle)
                btnProgress.setTextColor(R.color.black)
                btnPending.setBackgroundResource(R.drawable.redrectangle)
                btnPending.setTextColor(R.color.black)


                rv_list = ArrayList()
                rv_list!!.add(
                    HomeItem(
                        "Maths(CBSC)",
                        "244 Hours",
                        "24-10-2019",
                        "Grade 7",
                        "Completed"

                    )
                )
                rv_list!!.add(
                    HomeItem(
                        "Maths(ICSC)",
                        "244 Hours",
                        "24-10-2019",
                        "Grade 7",
                        "Completed"

                    )
                )
                rv_list!!.add(
                    HomeItem(
                        "Maths(HSC)",
                        "244 Hours",
                        "24-10-2019",
                        "Grade 7",
                        "Completed"

                    )
                )
                rv_list!!.add(
                    HomeItem(
                        "Maths(HSC)",
                        "244 Hours",
                        "24-10-2019",
                        "Grade 7",
                        "Completed"

                    )
                )


                val mAdapter =
                    HomeRecyclerAdapter(rv_list as ArrayList<HomeItem>)

                recyclerView!!.adapter = mAdapter

                recyclerView!!.itemAnimator = DefaultItemAnimator()


            }




        recyclerView = view.findViewById<View>(R.id.home_rv) as RecyclerView

        recyclerView!!.layoutManager = LinearLayoutManager(activity)

        rv_list = ArrayList()
        rv_list!!.add(
            HomeItem(
                "Maths(CBSC)",
                "244 Hours",
                "24-10-2019",
                "Grade 7",
                "Pending"

            )
        )
        rv_list!!.add(
            HomeItem(
                "Maths(ICSC)",
                "244 Hours",
                "24-10-2019",
                "Grade 7",
                "In Progress"

            )
        )
        rv_list!!.add(
            HomeItem(
                "Maths(HSC)",
                "244 Hours",
                "24-10-2019",
                "Grade 7",
                "Completed"

            )
        )
        rv_list!!.add(
            HomeItem(
                "Maths(CBSC)",
                "244 Hours",
                "24-10-2019",
                "Grade 7",
            "Pending"


            )
        )
        rv_list!!.add(
            HomeItem(
                "Maths(ICSC)",
                "244 Hours",
                "24-10-2019",
                "Grade 7",
            "Completed"


            )
        )
        rv_list!!.add(
            HomeItem(
                "Maths(HSC)",
                "244 Hours",
                "24-10-2019",
                "Grade 7",
            "In Progress"


            )
        )


        val mAdapter =
            HomeRecyclerAdapter(rv_list as ArrayList<HomeItem>)

        recyclerView!!.adapter = mAdapter

        recyclerView!!.itemAnimator = DefaultItemAnimator()

        //

        swipeController = SwipeController(object : SwipeControllerActions() {
            override fun onRightClicked(position: Int) {
                //mAdapter.rv_list.remove(position)

                val intent = Intent(getActivity(), SettingsActivity::class.java)
                getActivity()?.startActivity(intent)


                mAdapter.notifyItemRangeChanged(position, mAdapter.itemCount)
            }

            override fun onLeftClicked(position: Int) {
                //mAdapter.rv_list.remove(position)

                registerForContextMenu(recyclerView!!)

                mAdapter.notifyItemRangeChanged(position, mAdapter.itemCount)
            }

        })

        val itemTouchhelper = ItemTouchHelper(swipeController!!)
        itemTouchhelper.attachToRecyclerView(recyclerView)

        recyclerView!!.addItemDecoration(object : RecyclerView.ItemDecoration() {
            override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
                swipeController!!.onDraw(c)
            }
        })
        //

        return view
    }



    override fun onCreateContextMenu(
        menu: ContextMenu,
        v: View,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {

        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater = activity?.getMenuInflater()
        inflater?.inflate(com.shahin.alphaslatedemo.R.menu.main_menu, menu)
        menu.setHeaderTitle("Select The Action")
        menu.add(0, v.getId(), 0, "Call");//groupId, itemId, order, title
        menu.add(0, v.getId(), 0, "SMS");


    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        if (item.itemId === com.shahin.alphaslatedemo.R.id.action_cart) {
            Toast.makeText(activity, "cart", Toast.LENGTH_LONG).show()
        } else if (item.itemId === com.shahin.alphaslatedemo.R.id.action_send) {
            Toast.makeText(activity, "sending sms code", Toast.LENGTH_LONG).show()
        } else {
            super.onOptionsItemSelected(item)

            return true
        }
        return true
    }


}// Required empty public constructor
