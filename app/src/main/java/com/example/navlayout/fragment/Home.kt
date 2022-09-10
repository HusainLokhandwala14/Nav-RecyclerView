package com.example.navlayout.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navlayout.R
import com.example.navlayout.databinding.ActivityMainBinding
import com.example.navlayout.databinding.FragmentHomeBinding



class Home : Fragment() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(layoutInflater , R.layout.fragment_home , container,
        false)

        binding.homebtn.setOnClickListener{
            it.findNavController().navigate(R.id.action_home2_to_firstFragment)
        }
        return binding.root
    }


}