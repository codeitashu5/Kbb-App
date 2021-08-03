package com.example.ncert.recycler.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ncert.R

class CustomAdapter(val list: MutableList<String>,val o:ItemClickedListener) : RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

   inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
       init {
           itemView.setOnClickListener {
               o.onItemClicked(adapterPosition)
           }
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(
           R.layout.reccler_layout,
           parent,
           false
       )
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val text =  holder.itemView.findViewById<TextView>(R.id.text)
        val image = holder.itemView.findViewById<ImageView>(R.id.image)
        text.text = list[position]
        image.setImageResource(Data.image)
    }
    override fun getItemCount(): Int {
       return list.size
    }
}

interface ItemClickedListener{
    fun onItemClicked(pos:Int)
}
