package com.ali_sajjadi.tamrin

import android.util.Log

class Test private constructor() {


    companion object {

        val instance: Test by lazy {
            Test()
        }

    }


    fun showLog() {

        showText(10, 30)


    }

    //lambda
    //در لامبدا میتوان بعد ار دستوذات از کلاس هم استفاده کرد و متغیر کلاس را برمیگرداند
    private val showText = { num1: Int, num2: Int ->
        Log.i("TESTING", "test1")
        Log.i("TESTING", "test2")
        Log.i("TESTING", "test3")
        Log.i("TESTING", "test4")
        (num1 + num2) / 2
        Person()
    }

}
