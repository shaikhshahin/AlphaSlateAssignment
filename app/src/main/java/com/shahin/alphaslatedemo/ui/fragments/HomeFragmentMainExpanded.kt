package com.shahin.alphaslatedemo.ui.fragments

import android.content.Context
import android.content.Intent
import android.graphics.*
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.Toast

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.shahin.alphaslatedemo.R
import com.shahin.alphaslatedemo.ui.activity.SettingsActivity
import kotlinx.android.synthetic.main.activity_dynamic_recycler.*

import java.util.ArrayList
import com.shahin.alphaslatedemo.ui.fragments.RecyclerDataAdapter.SwipeHandler




class HomeFragmentMainExpanded : Fragment(), View.OnCreateContextMenuListener {
    private var mRecyclerView: RecyclerView? = null
    private var mContext: Context? = null
    lateinit var btnPending: Button
    lateinit var btnProgress: Button

    lateinit var btnCompleted: Button
    private val p = Paint()
    val arrDummyData = ArrayList<HomeParentDataItem>()
    lateinit var childDataItems: ArrayList<HomeChildDataItem>


    private/////////
    /////////
    /////////
    /////////
    /////////
    /////////
    /////////
    /////////
    /////////
    /////////
    /////////
    /////////
    /////////
    /////////
    /////////
    ////////
    val dummyDataToPass: ArrayList<HomeParentDataItem>
        get() {
            val arrDummyData = ArrayList<HomeParentDataItem>()
            var childDataItems: ArrayList<HomeChildDataItem>
            childDataItems = ArrayList()
            childDataItems.add(HomeChildDataItem("SubTitle 1"))
            arrDummyData.add(
                HomeParentDataItem(
                    "MATHS(HSC)",
                    "pending",
                    "244",
                    "18-11-2019",
                    childDataItems
                )
            )
            childDataItems = ArrayList()
            arrDummyData.add(
                HomeParentDataItem(
                    "MATHS(ICSC)",
                    "completed",
                    "244",
                    "18-11-2019",
                    childDataItems
                )
            )

            return arrDummyData
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.activity_dynamic_recycler, container, false)

        btnPending = view.findViewById(R.id.bt_pending)
        btnProgress = view.findViewById(R.id.bt_progress)
        btnCompleted = view.findViewById(R.id.bt_completed)

        var recyclerDataAdapter1 = RecyclerDataAdapter(pendingDataToPass)

        val swipeHandler = SwipeHandler(recyclerDataAdapter1)
        val itemTouchHelper = ItemTouchHelper(swipeHandler)
        mRecyclerView?.adapter = recyclerDataAdapter1

        recyclerDataAdapter1.setSwipeHandler(swipeHandler)
        itemTouchHelper.attachToRecyclerView(mRecyclerView)



        // initSwipe()
        registerForContextMenu(view)

        btnPending.setOnClickListener {

            btnPending.setBackgroundResource(R.drawable.darkred)

            val recyclerDataAdapter = RecyclerDataAdapter(pendingDataToPass)
            mRecyclerView!!.layoutManager = LinearLayoutManager(mContext)
            mRecyclerView!!.adapter = recyclerDataAdapter
            mRecyclerView!!.setHasFixedSize(true)




        }
        btnProgress.setOnClickListener {

            btnProgress.setBackgroundResource(R.drawable.darkyellow)

            val recyclerDataAdapter = RecyclerDataAdapter(progressDataToPass)
            mRecyclerView!!.layoutManager = LinearLayoutManager(mContext)
            mRecyclerView!!.adapter = recyclerDataAdapter
            mRecyclerView!!.setHasFixedSize(true)

        }

        btnCompleted.setOnClickListener {

            btnCompleted.setBackgroundResource(R.drawable.darkgreen)


            val recyclerDataAdapter = RecyclerDataAdapter(completedDataToPass)
            mRecyclerView!!.layoutManager = LinearLayoutManager(mContext)
            mRecyclerView!!.adapter = recyclerDataAdapter
            mRecyclerView!!.setHasFixedSize(true)


        }

        mRecyclerView = view.findViewById(R.id.recyclerView)
        val recyclerDataAdapter = RecyclerDataAdapter(dummyDataToPass)
        mRecyclerView!!.layoutManager = LinearLayoutManager(mContext)
        mRecyclerView!!.adapter = recyclerDataAdapter
        mRecyclerView!!.setHasFixedSize(true)

        return view


    }

    val pendingDataToPass: ArrayList<HomeParentDataItem>
        get() {
            childDataItems = ArrayList()
            childDataItems.add(HomeChildDataItem("SubTitle 1"))
            childDataItems.add(HomeChildDataItem("SubTitle 2"))
            childDataItems.add(HomeChildDataItem("SubTitle 3"))
            arrDummyData.add(
                HomeParentDataItem(
                    "MATHS (HSC)",
                    "pending",
                    "244",
                    "18-11-2019",
                    childDataItems
                )
            )
            childDataItems = ArrayList()
            childDataItems.add(HomeChildDataItem("SubTitle 1"))
            childDataItems.add(HomeChildDataItem("SubTitle 2"))
            childDataItems.add(HomeChildDataItem("SubTitle 3"))
            childDataItems.add(HomeChildDataItem("SubTitle 4"))
            childDataItems.add(HomeChildDataItem("SubTitle 5"))
            childDataItems.add(HomeChildDataItem("SubTitle 6"))
            arrDummyData.add(
                HomeParentDataItem(
                    "MATHS(ICSC)",
                    "pending",
                    "244",
                    "18-11-2019",
                    childDataItems
                )
            )
            childDataItems = ArrayList()
            childDataItems.add(HomeChildDataItem("SubTitle 1"))
            childDataItems.add(HomeChildDataItem("SubTitle 2"))
            childDataItems.add(HomeChildDataItem("SubTitle 3"))
            childDataItems.add(HomeChildDataItem("SubTitle 4"))
            childDataItems.add(HomeChildDataItem("SubTitle 5"))
            childDataItems.add(HomeChildDataItem("SubTitle 6"))
            childDataItems.add(HomeChildDataItem("SubTitle 7"))
            childDataItems.add(HomeChildDataItem("SubTitle 8"))
            childDataItems.add(HomeChildDataItem("SubTitle 9"))
            arrDummyData.add(
                HomeParentDataItem(
                    "MATHS(CBSC)",
                    "pending",
                    "244",
                    "18-11-2019",
                    childDataItems
                )
            )
            childDataItems = ArrayList()
            childDataItems.add(HomeChildDataItem("SubTitle 1"))
            arrDummyData.add(
                HomeParentDataItem(
                    "MATHS(HSC)",
                    "pending",
                    "244",
                    "18-11-2019",
                    childDataItems
                )
            )

            return arrDummyData
        }

    val progressDataToPass: ArrayList<HomeParentDataItem>
        get() {
            childDataItems = ArrayList()
            childDataItems.add(HomeChildDataItem("SubTitle 1"))
            childDataItems.add(HomeChildDataItem("SubTitle 2"))
            childDataItems.add(HomeChildDataItem("SubTitle 3"))
            arrDummyData.add(
                HomeParentDataItem(
                    "MATHS (HSC)",
                    "progress",
                    "244",
                    "18-11-2019",
                    childDataItems
                )
            )
            childDataItems = ArrayList()
            childDataItems.add(HomeChildDataItem("SubTitle 1"))
            childDataItems.add(HomeChildDataItem("SubTitle 2"))
            childDataItems.add(HomeChildDataItem("SubTitle 3"))
            childDataItems.add(HomeChildDataItem("SubTitle 4"))
            childDataItems.add(HomeChildDataItem("SubTitle 5"))
            childDataItems.add(HomeChildDataItem("SubTitle 6"))
            arrDummyData.add(
                HomeParentDataItem(
                    "MATHS(ICSC)",
                    "progress",
                    "244",
                    "18-11-2019",
                    childDataItems
                )
            )
            childDataItems = ArrayList()
            childDataItems.add(HomeChildDataItem("SubTitle 1"))
            childDataItems.add(HomeChildDataItem("SubTitle 2"))
            childDataItems.add(HomeChildDataItem("SubTitle 3"))
            childDataItems.add(HomeChildDataItem("SubTitle 4"))
            childDataItems.add(HomeChildDataItem("SubTitle 5"))
            childDataItems.add(HomeChildDataItem("SubTitle 6"))
            childDataItems.add(HomeChildDataItem("SubTitle 7"))
            childDataItems.add(HomeChildDataItem("SubTitle 8"))
            childDataItems.add(HomeChildDataItem("SubTitle 9"))
            arrDummyData.add(
                HomeParentDataItem(
                    "MATHS(CBSC)",
                    "progress",
                    "244",
                    "18-11-2019",
                    childDataItems
                )
            )
            childDataItems = ArrayList()
            childDataItems.add(HomeChildDataItem("SubTitle 1"))
            arrDummyData.add(
                HomeParentDataItem(
                    "MATHS(HSC)",
                    "progress",
                    "244",
                    "18-11-2019",
                    childDataItems
                )
            )

            return arrDummyData
        }
    val completedDataToPass: ArrayList<HomeParentDataItem>
        get() {
            childDataItems = ArrayList()
            childDataItems.add(HomeChildDataItem("SubTitle 1"))
            childDataItems.add(HomeChildDataItem("SubTitle 2"))
            childDataItems.add(HomeChildDataItem("SubTitle 3"))
            arrDummyData.add(
                HomeParentDataItem(
                    "MATHS (HSC)",
                    "completed",
                    "244",
                    "18-11-2019",
                    childDataItems
                )
            )
            childDataItems = ArrayList()
            childDataItems.add(HomeChildDataItem("SubTitle 1"))
            childDataItems.add(HomeChildDataItem("SubTitle 2"))
            childDataItems.add(HomeChildDataItem("SubTitle 3"))
            childDataItems.add(HomeChildDataItem("SubTitle 4"))
            childDataItems.add(HomeChildDataItem("SubTitle 5"))
            childDataItems.add(HomeChildDataItem("SubTitle 6"))
            arrDummyData.add(
                HomeParentDataItem(
                    "MATHS(ICSC)",
                    "completed",
                    "244",
                    "18-11-2019",
                    childDataItems
                )
            )
            childDataItems = ArrayList()
            childDataItems.add(HomeChildDataItem("SubTitle 1"))
            childDataItems.add(HomeChildDataItem("SubTitle 2"))
            childDataItems.add(HomeChildDataItem("SubTitle 3"))
            childDataItems.add(HomeChildDataItem("SubTitle 4"))
            childDataItems.add(HomeChildDataItem("SubTitle 5"))
            childDataItems.add(HomeChildDataItem("SubTitle 6"))
            childDataItems.add(HomeChildDataItem("SubTitle 7"))
            childDataItems.add(HomeChildDataItem("SubTitle 8"))
            childDataItems.add(HomeChildDataItem("SubTitle 9"))
            arrDummyData.add(
                HomeParentDataItem(
                    "MATHS(CBSC)",
                    "completed",
                    "244",
                    "18-11-2019",
                    childDataItems
                )
            )
            childDataItems = ArrayList()
            childDataItems.add(HomeChildDataItem("SubTitle 1"))
            arrDummyData.add(
                HomeParentDataItem(
                    "MATHS(HSC)",
                    "completed",
                    "244",
                    "18-11-2019",
                    childDataItems
                )
            )

            return arrDummyData
        }

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
                    val height = itemView.bottom.toFloat() - itemView.top.toFloat()
                    val width = height / 3

                    if (dX > 0) {
                        p.setColor(Color.parseColor("#40c0bd"))
                        val background = RectF(
                            itemView.left.toFloat(),
                            itemView.top.toFloat(),
                            dX,
                            itemView.bottom.toFloat()
                        )
                        c.drawRect(background, p)
                        icon = BitmapFactory.decodeResource(
                            resources,
                            com.shahin.alphaslatedemo.R.drawable.cart
                        )
                        val icon_dest = RectF(
                            itemView.left.toFloat() + width,
                            itemView.top.toFloat() + width,
                            itemView.left.toFloat() + 2 * width,
                            itemView.bottom.toFloat() - width
                        )
                        c.drawBitmap(icon, null, icon_dest, p)
                    } else {
                        p.setColor(Color.parseColor("#40c0bd"))
                        val background = RectF(
                            itemView.right.toFloat() + dX,
                            itemView.top.toFloat(),
                            itemView.right.toFloat(),
                            itemView.bottom.toFloat()
                        )
                        c.drawRect(background, p)
                        icon = BitmapFactory.decodeResource(
                            resources,
                            com.shahin.alphaslatedemo.R.drawable.more
                        )
                        val icon_dest = RectF(
                            itemView.right.toFloat() - 2 * width,
                            itemView.top.toFloat() + width,
                            itemView.right.toFloat() - width,
                            itemView.bottom.toFloat() - width
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

    override fun onCreateContextMenu(
        menu: ContextMenu,
        v: View,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        // inflate menu
        val inflater = activity!!.menuInflater
        inflater.inflate(R.menu.main_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        if (item.itemId === com.shahin.alphaslatedemo.R.id.action_cart) {
            Toast.makeText(activity, "settings", Toast.LENGTH_LONG).show()
        } else if (item.itemId === com.shahin.alphaslatedemo.R.id.action_send) {
            Toast.makeText(activity, "cart", Toast.LENGTH_LONG).show()
        } else {
            super.onOptionsItemSelected(item)

            return true
        }
        return true
    }


}
