package com.example.fragmentapp

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.fragmentapp.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentMainBinding>(inflater, R.layout.fragment_main, container, false)

        binding.btnFragment.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(MainFragmentDirections.actionMainFragment2ToMyFragment2())
        }

        binding.btnActivity.setOnClickListener {
            val intent = Intent(this@MainFragment.requireContext(), SecondActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }
}