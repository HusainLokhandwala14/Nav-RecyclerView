package com.example.navlayout.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.navlayout.R
import com.example.navlayout.adapter.RVAdapter
import com.example.navlayout.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentFirstBinding>(
            layoutInflater, R.layout.fragment_first, container, false
        )
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val rv: RecyclerView = view.findViewById(R.id.recycler_view)

        rv.layoutManager = LinearLayoutManager(this.context)
        val datafun = fetch()
        val adap = RVAdapter(datafun)
        rv.adapter = adap


    }

    private fun fetch(): ArrayList<String> {

        val list = ArrayList<String>()
        for (i in 0..100) {
            list.add(" Number $i")

        }
        return list


    }
}



