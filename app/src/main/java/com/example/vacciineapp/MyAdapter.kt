package com.example.vacciineapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val vaccineslist:ArrayList<VaccineModel>)
    : RecyclerView.Adapter<MyAdapter.MyviewHolder>(){
        inner class MyviewHolder(itemview: View):RecyclerView.ViewHolder(itemview)
        {
          lateinit var vaccineimage:ImageView
          lateinit var vaccinetitle:TextView

          init{
              vaccineimage=itemview.findViewById(R.id.img)
              vaccinetitle=itemview.findViewById(R.id.textview)
          }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val v=LayoutInflater.from(parent.context)
            .inflate(R.layout.recycle_view_layout,parent,false)
        return MyviewHolder(v)
    }

    override fun getItemCount(): Int {
      return vaccineslist.size
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        holder.vaccinetitle.setText(vaccineslist[position].name)
        holder.vaccineimage.setImageResource(vaccineslist[position].img)

    }
}