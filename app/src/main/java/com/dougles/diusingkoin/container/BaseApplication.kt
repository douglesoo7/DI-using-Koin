package com.dougles.diusingkoin.container

import android.app.Application
import com.dougles.diusingkoin.di.demoModule
import com.dougles.diusingkoin.di.interfaceModule
import com.dougles.diusingkoin.di.viewModelModule
import org.koin.core.context.startKoin

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(demoModule, interfaceModule, viewModelModule)
        }
    }
}