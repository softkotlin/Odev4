package com.free.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.free.odev4.databinding.FragmentAnaBinding

class AnaFragment : Fragment() {
    private lateinit var binding: FragmentAnaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnaBinding.inflate(inflater, container, false)

        binding.goToAFragment.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.ana_sayfa_to_a)
        }

        binding.goToXFragment.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.ana_sayfa_to_x)
        }

        return  binding.root
    }

}