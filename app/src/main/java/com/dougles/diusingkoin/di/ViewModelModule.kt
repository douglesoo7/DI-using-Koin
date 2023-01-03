package com.dougles.diusingkoin.di

import com.dougles.diusingkoin.viewmodel.MainViewModel
import com.dougles.diusingkoin.viewmodel.Test
import com.dougles.diusingkoin.viewmodel.TestImp
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

val viewModelModule = module {

    factory { TestImp() } bind Test::class
    viewModel { MainViewModel(get()) }

}