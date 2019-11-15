package com.shahin.alphaslatedemo.ui.fragments

class HomeItem {
    lateinit var title: String
    lateinit var time: String
    lateinit var date: String
    lateinit var grade: String



    constructor(title: String, time: String, date:String, grade:String) {
        this.title = title
        this.time = time
        this.date= date
        this.grade = grade

    }
}
