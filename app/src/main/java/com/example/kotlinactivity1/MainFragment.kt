package com.example.kotlinactivity1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlinactivity1.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private var count = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.plusOne.setOnClickListener {
            count = count.inc()
            binding.tvZero.text = count.toString()
        }
        binding.minusOne.setOnClickListener {
           count = count.dec()
            binding.tvZero.text = count.toString()

            if(binding.tvZero.equals("10")) {
                binding.minusOne.text = "-1"
            }
        }

    }

}