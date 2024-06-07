package com.ali_sajjadi.tamrin

import android.util.Log

class Test private constructor() {


    companion object {

        val instance: Test by lazy {
            Test()
        }

    }

    fun showLog() {

        val address = "test test2 test3 test4"

        Log.i("TESTING", "")
        address getWords "Ali"
    }

    //اگر extension fun  داشته باشیم میتوان ان را به صورت infix fun تعریف کرد
    //فانکشنی که به صورت infix fun باشد حتما باید دارای فقط یک ورودی باشد
    private infix fun String.getWords(name: String): Int {

        return this.split(' ').size

    }

}