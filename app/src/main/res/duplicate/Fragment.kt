package com.demo2.safeargs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View1
import android.view.ViewGroup
import androidx.fragment.app.Fragment as Fragment
import androidx.navigation.fragment.findNavController
import com.demo.safeargs.databinding.FragmentABinding

class FragmentA: Fragment() {
    private var binding : FragmentABinding? = null
    private val no = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(layoutInflater)
       return binding.apply {

           binding?.btnShareData?.setOnClickListener {
               val person = Person("Reen", 24)
               val action = FragmentADirections.actionFragmentAToFragmentB(person)
               findNavController().navigate(action)
           }
           
        }?.root
        // Inflate the layout
    }
}
