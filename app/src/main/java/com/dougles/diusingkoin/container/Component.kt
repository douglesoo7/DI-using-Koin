package com.dougles.diusingkoin.container

import com.dougles.diusingkoin.demo.classes.Car
import com.dougles.diusingkoin.demo.interfaces.Main
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class Component : KoinComponent {

    val car: Car by inject()

    val main: Main by inject()
}