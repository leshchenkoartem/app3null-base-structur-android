package com.binding.mobile.main

import com.app3null.basestructure.viewModels.BaseViewModel

class MainViewModel : BaseViewModel<MainViewState>() {
    override fun getInitialState(): MainViewState {
        return MainViewState
    }
}