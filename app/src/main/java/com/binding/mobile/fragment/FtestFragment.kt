package com.binding.mobile.fragment

import android.os.Bundle
import com.app3null.basestructure.fragments.BaseFragment
import com.app3null.basestructure.common.extensions.notNull
import com.app3null.basestructure.dialogs.Loader
import com.app3null.common_code.extensions.showThrowableMessage
import org.koin.android.viewmodel.ext.android.viewModel
import com.binding.mobile.databinding.FragmentFtestBinding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FtestFragment : BaseFragment<FtestViewState, FtestViewModel>() {

    private var _binding: FragmentFtestBinding? = null
    private val binding get() = _binding!!

    private val viewModel: FtestViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        _binding = FragmentFtestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    override fun provideViewModel(): FtestViewModel {
        return viewModel
    }

    override fun reflectState(viewState: FtestViewState) {
        viewState.showLoader?.getValue().notNull {
            registerDialog(Loader.show(requireContext()))
        }

        viewState.showError?.getValue().notNull {
            dismissAndClearDialogs()
            requireContext().showThrowableMessage(it)
        }
    }

    override fun renderView(savedInstanceState: Bundle?) {
        viewModel.testFunction()
    }
}