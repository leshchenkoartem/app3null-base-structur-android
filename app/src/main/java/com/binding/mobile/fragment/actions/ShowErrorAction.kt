package com.binding.mobile.fragment.actions

import com.app3null.basestructure.actions.ViewStateAction
import com.app3null.basestructure.models.DisposableValue
import com.binding.mobile.fragment.FtestViewState

class ShowErrorAction(private val throwable: Throwable) : ViewStateAction<FtestViewState> {
    override fun newState(oldState: FtestViewState): FtestViewState {
        return oldState.copy(showError = DisposableValue(throwable))
    }
}
