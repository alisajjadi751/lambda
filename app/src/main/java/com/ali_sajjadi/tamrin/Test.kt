package com.ali_sajjadi.tamrin

import android.util.Log

class Test private constructor(){


    companion object {

        val instance: Test by lazy {
            Test()
        }

    }

    fun showLog(){

        val name = "ali sajjadi"

        //برگرداندن یک حرف
        name[3]

        //یرگردادن طول نوشته
        name.length

        //برگردادن اولین و اخرین حرف
        name.first()
        name.last()

        //حذف فاصله انتها و ابتدا که بیشتر برای دریافت پسورد به کار میرود
        name.trim()
        name.trimStart()
        name.trimEnd()

        //برعکس کردن رشته
        val test = name.reversed()

        //بررسی ابتدا . انتهای رشته و بولین برمیگرداند
        name.startsWith("ali")
        name.endsWith("sajjadi")

        //چای گذاری
        val test2 = name.replace('a','*')

        //چک کردن وجود یک رشته در رشته مورد نظر و بولین برمیکرداند
        name.contains("ali")




        Log.i("TESTING","${name.endsWith("sajjadi")}")
    }

}