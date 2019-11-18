package com.shahin.alphaslatedemo.ui.fragments

import java.io.Serializable
import java.util.ArrayList

class HomeParentDataItem(
    var parentName: String?,
    var status : String?,
    var time : String?,
    var date : String?,



    var childDataItems: ArrayList<HomeChildDataItem>?
) : Serializable