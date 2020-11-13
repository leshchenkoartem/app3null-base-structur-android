package com.binding.mobile.testActivity

import com.app3null.basestructure.viewModels.BaseViewModel

class AtestViewModel : BaseViewModel<AtestViewState>() {

    override fun getInitialState(): AtestViewState {
        return AtestViewState
    }
}