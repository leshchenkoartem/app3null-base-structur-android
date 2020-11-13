package com.app3null.basestructure.actions

interface ViewStateAction<VIEW_STATE> {
    fun newState(oldState: VIEW_STATE): VIEW_STATE
}