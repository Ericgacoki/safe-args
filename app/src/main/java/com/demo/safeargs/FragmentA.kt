package com.demo.safeargs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.demo.safeargs.databinding.FragmentABinding

class FragmentA: Fragment() {
    private var binding : FragmentABinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(layoutInflater)
       return binding.apply {

           binding?.btnShareData?.setOnClickListener {
               val person = Person("Eric", 19)
               val action = FragmentADirections.actionFragmentAToFragmentB(person)
               findNavController().navigate(action)
           }

        }?.root
    }
}
