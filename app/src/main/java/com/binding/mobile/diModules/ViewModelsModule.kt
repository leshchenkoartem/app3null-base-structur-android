package com.binding.mobile.diModules

import com.binding.mobile.fragment.FtestViewModel
import com.binding.mobile.ui.activitymain.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {
    viewModel { MainViewModel() }
    viewModel { FtestViewModel() }
}