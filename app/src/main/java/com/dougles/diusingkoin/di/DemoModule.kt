package com.dougles.diusingkoin.di

import com.dougles.diusingkoin.demo.classes.Car
import com.dougles.diusingkoin.demo.classes.Engine
import com.dougles.diusingkoin.demo.classes.Wheels
import org.koin.dsl.module

val demoModule = module {

    factory { Car(get(), get()) }
    factory { Wheels() }
    factory { Engine() }
}