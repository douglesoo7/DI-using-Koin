package com.dougles.diusingkoin.demo.interfaces

import android.util.Log

private const val TAG = "dependency"

interface DemoOne {
    fun getDemoOne()
}

interface DemoTwo {
    fun getDemoTwo()
}

class DemoImpl : DemoOne, DemoTwo {
    override fun getDemoOne() {
        Log.d(TAG, "getDemoOne: DemoOne called")
    }

    override fun getDemoTwo() {
        Log.d(TAG, "getDemoTwo: DemoTwo called")
    }
}

class Main(private val demoOne: DemoOne, private val demoTwo: DemoTwo) {
    fun getDemoOne() {
        demoOne.getDemoOne()
    }

    fun getDemoTwo() {
        demoTwo.getDemoTwo()
    }
}