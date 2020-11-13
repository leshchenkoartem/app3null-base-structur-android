package com.binding.mobile.diModules

import org.koin.android.ext.koin.androidContext
import org.koin.core.qualifier.named
import org.koin.dsl.module

const val INTERNAL_STORAGE_PATH = "INTERNAL_STORAGE_PATH"
val repositoryModule = module {
    single(named(INTERNAL_STORAGE_PATH)) {
        androidContext().noBackupFilesDir.absolutePath
        //Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).absolutePath
    }
}