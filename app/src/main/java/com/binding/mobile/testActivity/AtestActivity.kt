package com.binding.mobile.testActivity

import android.os.Bundle
import com.app3null.basestructure.activities.BaseActivity
import com.binding.mobile.databinding.ActivityAtestBinding
import org.koin.android.viewmodel.ext.android.viewModel


class AtestActivity : BaseActivity<AtestViewState, AtestViewModel>() {
    private lateinit var binding: ActivityAtestBinding
    private val viewModel: AtestViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAtestBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        renderView(savedInstanceState)
    }

    override fun provideViewModel(): AtestViewModel {
        return viewModel
    }

    override fun reflectState(viewState: AtestViewState) {

    }

    override fun renderView(savedInstanceState: Bundle?) {

    }
}