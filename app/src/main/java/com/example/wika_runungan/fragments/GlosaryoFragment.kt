package com.example.wika_runungan.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wika_runungan.R
import com.example.wika_runungan.adapters.GlosaryAdapter
import com.example.wika_runungan.adapters.NoliAdapter
import com.example.wika_runungan.data.Glosary
import com.example.wika_runungan.data.Noli
import com.example.wika_runungan.databinding.FragmentGlosaryoBinding


class GlosaryoFragment : Fragment() {

    private lateinit var binding : FragmentGlosaryoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGlosaryoBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment

        var kabanataLists = arrayListOf(Glosary("title","sdf"),Glosary("title","sdf"),Glosary("title","sdf"))


        val adapter = GlosaryAdapter(this@GlosaryoFragment.requireContext(), kabanataLists) {position ->
            if (position == 0){
                Toast.makeText(context ,"0",Toast.LENGTH_SHORT).show()
            }
            if (position == 1){
                Toast.makeText(context ,"1",Toast.LENGTH_SHORT).show()
            }
        }


        binding.recycler.adapter = adapter
        binding.recycler.layoutManager = LinearLayoutManager(this@GlosaryoFragment.requireContext())
        return binding.root
    }




}