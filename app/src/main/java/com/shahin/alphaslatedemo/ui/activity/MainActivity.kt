package com.shahin.alphaslatedemo.ui.activity

import android.os.Bundle

import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment

import com.google.android.material.bottomnavigation.BottomNavigationView
import com.shahin.alphaslatedemo.R
import com.shahin.alphaslatedemo.ui.fragments.*
import com.shahin.alphaslatedemo.ui.fragments.HomeFragmentMainExpanded


class MainActivity : AppCompatActivity() {


    internal val fragment1: Fragment =
        HomeFragmentMainExpanded()
    internal val fragment2: Fragment = CartFragment()
    internal val fragment3: Fragment = MyCoursesFragment()
    internal val fragment4: Fragment = ExamPlanner()
    internal val fragment5: Fragment = MoreFragment()

    internal val fm = supportFragmentManager
    internal var active = fragment1


    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    fm.beginTransaction().hide(active).show(fragment1).commit()
                    active = fragment1
                    return@OnNavigationItemSelectedListener true
                }

                R.id.navigation_dashboard -> {
                    fm.beginTransaction().hide(active).show(fragment2).commit()
                    active = fragment2
                    return@OnNavigationItemSelectedListener true
                }

                R.id.navigation_notifications -> {
                    fm.beginTransaction().hide(active).show(fragment3).commit()
                    active = fragment3
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_examplanner -> {
                    fm.beginTransaction().hide(active).show(fragment4).commit()
                    active = fragment4
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_more -> {
                    fm.beginTransaction().hide(active).show(fragment5).commit()
                    active = fragment5
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        //        setSupportActionBar(toolbar);


        val navigation = findViewById<View>(R.id.navigation) as BottomNavigationView
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        fm.beginTransaction().add(R.id.main_container, fragment5, "5").hide(fragment5).commit()
        fm.beginTransaction().add(R.id.main_container, fragment4, "4").hide(fragment4).commit()
        fm.beginTransaction().add(R.id.main_container, fragment3, "3").hide(fragment3).commit()
        fm.beginTransaction().add(R.id.main_container, fragment2, "2").hide(fragment2).commit()
        fm.beginTransaction().add(R.id.main_container, fragment1, "1").commit()

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.action_cart) {
            Toast.makeText(this, "Cart clicked", Toast.LENGTH_LONG).show();

            // startActivity(Intent(this@MainActivity, SettingsActivity::class.java))
            return true
        }else if (id == R.id.action_send) {
            Toast.makeText(this, "Send clicked", Toast.LENGTH_LONG).show();

            return true
        }else
        {
            Toast.makeText(this, "Notify clicked", Toast.LENGTH_LONG).show();


        }

        return super.onOptionsItemSelected(item)
    }


}
