package com.binding.mobile.fragment

import com.app3null.basestructure.viewModels.BaseViewModel

class FtestViewModel : BaseViewModel<FtestViewState>() {

    override fun getInitialState(): FtestViewState {
        return FtestViewState()
    }
}