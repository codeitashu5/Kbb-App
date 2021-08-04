package com.example.ncert.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ncert.R
import com.example.ncert.databinding.FragmentGameFrontBinding
import com.example.ncert.recycler.view.CustomAdapter
import com.example.ncert.recycler.view.Data
import com.example.ncert.recycler.view.Data.Companion.list
import com.example.ncert.recycler.view.Item
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
        recyclerView.adapter = CustomAdapter(list,this)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        //the action is put-ing the arguments so the changes can be made

        var pos = 1
        var status = true

        arguments?.let{
            pos = it.getInt("position")
            status = it.getBoolean("status")
            makeChanges(pos,status)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onItemClicked(pos: Int) {
         val action = GameFrontFragmentDirections.actionGameFrontFragmentToQuestionFragment(pos)
         findNavController().navigate(action)
    }

    private fun makeChanges(pos:Int,status:Boolean){
       if(status){
           val str = list[pos].str
           list[pos] = Item(str,R.drawable.check)
       }
       else{
            val str = list[pos].str
            list[pos] = Item(str,R.drawable.ic_red_checkmark)
        }

        recyclerView.adapter = CustomAdapter(list,this)

    }

}