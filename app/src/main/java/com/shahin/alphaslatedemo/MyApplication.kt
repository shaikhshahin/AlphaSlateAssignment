package com.shahin.alphaslatedemo

import android.app.Application
import android.text.TextUtils

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {

        val TAG = MyApplication::class.java
            .simpleName


        @get:Synchronized
        var instance: MyApplication? = null
            private set
    }


}
