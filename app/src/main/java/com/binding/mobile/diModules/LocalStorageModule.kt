package com.binding.mobile.diModules


import androidx.preference.PreferenceManager.getDefaultSharedPreferences
import com.app3null.basestructure.preferences.Preferences
import com.app3null.basestructure.preferences.PreferencesImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val localStorageModule = module {
//    single {
//        Room.databaseBuilder(androidContext(), Database::class.java, "soberway")
//            .fallbackToDestructiveMigration().build()
//    } bind Database::class

    single {
        getDefaultSharedPreferences(androidContext())
    }

    single {
        PreferencesImpl(get()) as Preferences
    }

}