package com.binding.mobile.ui.activitymain

import com.app3null.basestructure.viewModels.BaseViewModel

class MainViewModel : BaseViewModel<MainViewState>() {

    override fun getInitialState(): MainViewState {
        return MainViewState
    }

    fun getTestStr(): String {
        return "~~~TestViewModel"
    }
}