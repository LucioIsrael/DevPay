package br.com.project.devpay.presentation.fragments.TelaPrincipal

import android.view.LayoutInflater
import android.view.ViewGroup
import br.com.project.devpay.databinding.TelaPrincipalFragmentBinding
import br.com.project.devpay.presentation.base.BaseFragment

class TelaPrincipalFragment: BaseFragment<TelaPrincipalFragmentBinding>() {

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): TelaPrincipalFragmentBinding =
        TelaPrincipalFragmentBinding.inflate(inflater, container, false)
}
