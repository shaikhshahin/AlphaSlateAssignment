package com.shahin.alphaslatedemo.ui.fragments

class HomeItem {
    lateinit var desc: String
    var id: Int = 0


    constructor(desc: String, id: Int) {
        this.desc = desc
        this.id = id
    }
}
