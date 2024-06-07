package com.ali_sajjadi.tamrin

import android.util.Log

class Test private constructor(){


    companion object {

        val instance: Test by lazy {
            Test()
        }

    }

    fun showLog(){

        val address ="test test2 test3 test4"

        Log.i("TESTING",address.getWords().toString())
    }

    private fun String.getWords():Int{

        return this.split(' ').size

    }

}