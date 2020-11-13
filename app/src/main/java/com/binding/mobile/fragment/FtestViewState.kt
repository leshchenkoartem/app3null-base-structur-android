package com.binding.mobile.fragment

import com.app3null.basestructure.models.DisposableValue

data class FtestViewState(
    val showLoader: DisposableValue<Boolean>? = null,
    val showError: DisposableValue<Throwable>? = null,
    val goTo: DisposableValue<Boolean>? = null
)
