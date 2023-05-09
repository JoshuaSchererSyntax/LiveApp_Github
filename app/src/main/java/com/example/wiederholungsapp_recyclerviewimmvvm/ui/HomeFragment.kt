package com.example.wiederholungsapp_recyclerviewimmvvm.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.example.wiederholungsapp_recyclerviewimmvvm.MainViewModel
import com.example.wiederholungsapp_recyclerviewimmvvm.R
import com.example.wiederholungsapp_recyclerviewimmvvm.adapter.TextAdapter
import com.example.wiederholungsapp_recyclerviewimmvvm.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    //we reference our binding
    private lateinit var binding: FragmentHomeBinding

    //reference to our viewModel
    private val viewModel: MainViewModel by activityViewModels()

    //builds our layout
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /*
        * override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {*/

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        /*
        * override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {*/
        return binding.root
    }

    //functionality of the fragment
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        /*
       * override fun onCreateView(
       inflater: LayoutInflater,
       container: ViewGroup?,
       savedInstanceState: Bundle?
   ): View? {*/
        super.onViewCreated(view, savedInstanceState)

        //observe our list of texts
                viewModel.texts.observe(viewLifecycleOwner) { abc ->
            /*
       * override fun onCreateView(
       inflater: LayoutInflater,
       container: ViewGroup?,
       savedInstanceState: Bundle?
   ): View? {*/binding.rvText.adapter = TextAdapter(abc, viewModel)
        }

    }
}