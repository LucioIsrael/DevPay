package br.com.project.devpay.presentation.fragments.Login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.com.project.devpay.R
import br.com.project.devpay.databinding.LoginFragmentBinding
import br.com.project.devpay.presentation.base.BaseFragment

class LoginFragment: BaseFragment<LoginFragmentBinding>() {

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): LoginFragmentBinding =
        LoginFragmentBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClickButton()
    }

    private fun onClickButton() {
        binding.btnLogar.setOnClickListener {
            findNavController().navigate(R.id.fromLoginFragmentToPrincipalFragment)
        }
    }

}
