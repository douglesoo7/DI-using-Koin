package com.dougles.diusingkoin.viewmodel

import android.util.Log

interface Test {
    fun getTest()
}

class TestImp : Test {
    override fun getTest() {
        Log.d("dependency", "Hey ViewModel")
    }

}