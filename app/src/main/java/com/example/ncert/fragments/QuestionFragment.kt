package com.example.ncert.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.ncert.R
import com.example.ncert.databinding.FragmentQuestionBinding
import com.example.ncert.recycler.view.Data
import kotlin.properties.Delegates


class QuestionFragment : Fragment() {

   private var _binding: FragmentQuestionBinding? = null
   private val binding get() = _binding!!
   var pos:Int? = null
   var status:Boolean? = null



   override fun onCreateView(
      inflater: LayoutInflater,
      container: ViewGroup?,
      savedInstanceState: Bundle?
   ): View? {
      _binding = FragmentQuestionBinding.inflate(inflater,
         container,
         false)

      return binding.root
   }

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      //here we put our code

      pos = 5

      setState(binding.btn1,pos!!,0)
      setState(binding.btn2,pos!!,1)
      setState(binding.btn3,pos!!,2)
      setState(binding.btn4,pos!!,3)

      binding.btn1.setOnClickListener {
        status =  verifyAns(1)
         //navigate back to the starting pos with the status and pos
         goBack(status!!,pos!!)
      }
      binding.btn2.setOnClickListener {
         status =  verifyAns(1)
         goBack(status!!,pos!!)
      }
      binding.btn3.setOnClickListener {
         status =  verifyAns(1)
         goBack(status!!,pos!!)
      }
      binding.btn4.setOnClickListener {
         status =  verifyAns(1)
         goBack(status!!,pos!!)
      }


   }

   override fun onDestroyView() {
      super.onDestroyView()
      _binding = null
   }


   private fun verifyAns(no:Int) : Boolean{
      val key = Data.hashmap.keys.elementAt(pos!!)
      return no == Data.hashmap.getValue(key)
   }

   private fun setState(view:Button,r:Int,c:Int){
      view.text = Data.options[r][c]
   }

   private fun goBack(status:Boolean,pos:Int){

   }

}