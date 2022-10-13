package br.com.project.devpay.presentation.fragments.Home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.com.project.devpay.R
import br.com.project.devpay.databinding.HomeFragmentBinding
import br.com.project.devpay.presentation.base.BaseFragment

class HomeFragment : BaseFragment<HomeFragmentBinding>() {

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): HomeFragmentBinding =
        HomeFragmentBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClickButtons()
    }

    fun onClickButtons() {
        binding.tvLogin.setOnClickListener {
            findNavController().navigate(R.id.fromHomeFragmentToLoginFragment)
        }
    }
}