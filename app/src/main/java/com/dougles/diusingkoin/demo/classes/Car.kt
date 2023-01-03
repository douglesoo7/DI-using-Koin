package com.dougles.diusingkoin.demo.classes

import android.util.Log

class Car(private val engine: Engine, private val wheels: Wheels) {

    companion object {
        private const val TAG = "dependency"
    }

    fun startTheCar() {
        if (engine != null && wheels != null)
            Log.d(TAG, "Car Started...")
    }

}