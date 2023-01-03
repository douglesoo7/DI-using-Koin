package com.dougles.diusingkoin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dougles.diusingkoin.container.Component

class MainActivity : AppCompatActivity() {

    private val component: Component = Component()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        component.car.startTheCar()
        component.main.getDemoOne()
        component.main.getDemoTwo()

        component.mainViewModel.getTest()
    }
}