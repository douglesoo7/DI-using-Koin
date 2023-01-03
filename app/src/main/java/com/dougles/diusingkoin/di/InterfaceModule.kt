package com.dougles.diusingkoin.di

import com.dougles.diusingkoin.demo.interfaces.DemoImpl
import com.dougles.diusingkoin.demo.interfaces.DemoOne
import com.dougles.diusingkoin.demo.interfaces.DemoTwo
import com.dougles.diusingkoin.demo.interfaces.Main
import org.koin.dsl.binds
import org.koin.dsl.module

val interfaceModule = module {
    factory { DemoImpl() } binds arrayOf(DemoOne::class, DemoTwo::class)
    factory { Main(get(), get()) }
}