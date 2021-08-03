package com.app3null.basestructure.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.module.Module

@HiltAndroidApp
abstract class MvvmApplication :
    Application() {

}

