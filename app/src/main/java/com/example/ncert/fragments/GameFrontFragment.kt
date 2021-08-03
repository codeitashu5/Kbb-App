package com.example.ncert.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ncert.R
import com.example.ncert.databinding.FragmentGameFrontBinding
import com.example.ncert.recycler.view.CustomAdapter
import com.example.ncert.recycler.view.Data
import com.example.ncert.recycler.view.ItemClickedListener


class GameFrontFragment : Fragment(),ItemClickedListener {


   private var _binding : FragmentGameFrontBinding? = null
   private val binding : FragmentGameFrontBinding get() = _binding!!

  lateinit var  recyclerView : RecyclerView


   override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
   ): View? {
     _binding = FragmentGameFrontBinding.inflate(inflater,
        container,
        false)

     return binding.root
   }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //here we put our code
        recyclerView = binding.recyclerView

        recyclerView.adapter = CustomAdapter(Data.list,this)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onItemClicked(pos: Int) {

    }

}