package com.binding.mobile.fragment.actions

import com.app3null.basestructure.actions.ViewStateAction
import com.app3null.basestructure.models.DisposableValue
import com.binding.mobile.fragment.FtestViewState

class ShowLoaderAction : ViewStateAction<FtestViewState> {
    override fun newState(oldState: FtestViewState): FtestViewState {
        return oldState.copy(showLoader = DisposableValue(true))
    }
}
