package com.demo.safeargs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavArgs
import androidx.navigation.NavArgsLazy
import androidx.navigation.fragment.navArgs
import com.demo.safeargs.databinding.FragmentBBinding

class FragmentB : Fragment() {
    private var binding: FragmentBBinding? = null
    private val args: FragmentBArgs by navArgs<FragmentBArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(layoutInflater)
        return binding.apply {

            val personParcel = args.person
            binding?.textView?.text = "My Name is: ${personParcel.name}\nI\'m ${personParcel.age} years old."

        }?.root
    }
}