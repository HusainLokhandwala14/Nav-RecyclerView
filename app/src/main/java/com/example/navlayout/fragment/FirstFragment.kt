package com.example.navlayout.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.navlayout.R
import com.example.navlayout.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

    val binding = DataBindingUtil.inflate<FragmentFirstBinding>(layoutInflater
    , R.layout.fragment_first , container , false)

    return binding.root
    }


}