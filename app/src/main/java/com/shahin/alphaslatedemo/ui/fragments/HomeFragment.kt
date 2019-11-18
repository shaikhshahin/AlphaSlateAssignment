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
import com.shahin.alphaslatedemo.R
import com.shahin.alphaslatedemo.ui.activity.SettingsActivity
import android.widget.Toast
import android.view.*
import android.view.MenuInflater
import android.view.ContextMenu
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_home.*
import android.widget.EditText
import android.content.DialogInterface
import android.view.ViewGroup
import android.graphics.Color.parseColor
import android.graphics.*




class HomeFragment : Fragment(),View.OnCreateContextMenuListener {

    private var rv_list: MutableList<HomeItem>? = null
    private var recyclerView: RecyclerView? = null
    var swipeController: SwipeController? = null
     lateinit var btnPending: Button
    lateinit var btnProgress: Button

    lateinit var btnCompleted: Button
    private val p = Paint()


    @SuppressLint("ResourceAsColor")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)


        btnPending = view.findViewById(R.id.bt_pending)
        btnProgress = view.findViewById(R.id.bt_progress)
        btnCompleted = view.findViewById(R.id.bt_completed)

        recyclerView = view.findViewById(R.id.home_rv)

        recyclerView?.layoutManager = LinearLayoutManager(activity)


        btnPending.setOnClickListener {
            // your code to perform when the user clicks on the button
            btnPending.setBackgroundResource(R.drawable.darkred)
            btnPending.setTextColor(R.color.white)

            btnPending.setPressed(true)

            /*btnCompleted.setBackgroundResource(R.drawable.greenrectangle)
            btnCompleted.setTextColor(R.color.black)

            btnProgress.setBackgroundResource(R.drawable.yellowrectangle)
            btnProgress.setTextColor(R.color.black)*/

            //rv_list = ArrayList()
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

            recyclerView?.adapter = mAdapter

            recyclerView?.itemAnimator = DefaultItemAnimator()


        }

        btnProgress.setOnClickListener {
            // your code to perform when the user clicks on the button
            btnProgress.setBackgroundResource(R.drawable.darkyellow)
            btnProgress.setTextColor(R.color.white)

            btnProgress.setPressed(true)

            /*btnCompleted.setBackgroundResource(R.drawable.greenrectangle)
            btnCompleted.setTextColor(R.color.black)
            btnPending.setBackgroundResource(R.drawable.redrectangle)
            btnPending.setTextColor(R.color.black)*/



           // rv_list = ArrayList()
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

            recyclerView?.adapter = mAdapter

            recyclerView?.itemAnimator = DefaultItemAnimator()


        }
            btnCompleted.setOnClickListener {
                // your code to perform when the user clicks on the button
                btnCompleted.setBackgroundResource(R.drawable.darkgreen)
                btnCompleted.setTextColor(R.color.white)

                btnCompleted.setPressed(true)

               /* btnProgress.setBackgroundResource(R.drawable.yellowrectangle)
                btnProgress.setTextColor(R.color.black)
                btnPending.setBackgroundResource(R.drawable.redrectangle)
                btnPending.setTextColor(R.color.black)*/


                //rv_list = ArrayList()
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

                recyclerView?.adapter = mAdapter

                recyclerView?.itemAnimator = DefaultItemAnimator()


            }






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
        /*rv_list!!.add(
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
        )*/


        val mAdapter =
            HomeRecyclerAdapter(rv_list as ArrayList<HomeItem>)

        recyclerView?.adapter = mAdapter

        recyclerView?.itemAnimator = DefaultItemAnimator()

        initSwipe()

        //
/*
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
        })*/
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
            if (inflater != null) {
                inflater.inflate(com.shahin.alphaslatedemo.R.menu.main_menu, menu)
            }
            menu.setHeaderTitle("Select The Action")


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


    //
    private fun initSwipe() {
        val simpleItemTouchCallback = object :
            ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {

            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return false
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position = viewHolder.adapterPosition

                if (direction == ItemTouchHelper.LEFT) {

                    recyclerView?.let { registerForContextMenu(it) };
                } else {

                    val intent = Intent(getActivity(), SettingsActivity::class.java)
                    getActivity()?.startActivity(intent)

                }
            }

            override fun onChildDraw(
                c: Canvas,
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                dX: Float,
                dY: Float,
                actionState: Int,
                isCurrentlyActive: Boolean
            ) {

                val icon: Bitmap
                if (actionState == ItemTouchHelper.ACTION_STATE_SWIPE) {

                    val itemView = viewHolder.itemView
                    val height = itemView.bottom .toFloat() - itemView.top.toFloat()
                    val width = height / 3

                    if (dX > 0) {
                        p.setColor(Color.parseColor("#40c0bd"))
                        val background = RectF(
                            itemView.left .toFloat(),
                            itemView.top .toFloat(),
                            dX,
                            itemView.bottom .toFloat()
                        )
                        c.drawRect(background, p)
                        icon = BitmapFactory.decodeResource(resources, com.shahin.alphaslatedemo.R.drawable.cart)
                        val icon_dest = RectF(
                            itemView.left .toFloat() + width,
                            itemView.top .toFloat() + width,
                            itemView.left .toFloat() + 2 * width,
                            itemView.bottom .toFloat() - width
                        )
                        c.drawBitmap(icon, null, icon_dest, p)
                    } else {
                        p.setColor(Color.parseColor("#40c0bd"))
                        val background = RectF(
                            itemView.right.toFloat() + dX,
                            itemView.top .toFloat(),
                            itemView.right.toFloat(),
                            itemView.bottom.toFloat()
                        )
                        c.drawRect(background, p)
                        icon = BitmapFactory.decodeResource(resources, com.shahin.alphaslatedemo.R.drawable.more)
                        val icon_dest = RectF(
                            itemView.right .toFloat() - 2 * width,
                            itemView.top .toFloat() + width,
                            itemView.right .toFloat() - width,
                            itemView.bottom .toFloat() - width
                        )
                        c.drawBitmap(icon, null, icon_dest, p)
                    }
                }
                super.onChildDraw(
                    c,
                    recyclerView,
                    viewHolder,
                    dX,
                    dY,
                    actionState,
                    isCurrentlyActive
                )
            }
        }
        val itemTouchHelper = ItemTouchHelper(simpleItemTouchCallback)
        itemTouchHelper.attachToRecyclerView(recyclerView)
    }





    //


}// Required empty public constructor
