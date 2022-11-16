package com.example.projectm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.projectm.databinding.FragmentLoginBinding
import com.example.projectm.databinding.FragmentRegisterBinding

class RegisterFragment: Fragment() {
    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val findNavController : NavController = Navigation.findNavController(view)
        binding.button4.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_loginScreen)
        }

        binding.button5.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_homeFragment)
        }
    }
}
