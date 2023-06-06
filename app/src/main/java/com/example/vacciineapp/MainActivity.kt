package com.example.vacciineapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recyclerview:RecyclerView=findViewById(R.id.recycleview)
        recyclerview.layoutManager=LinearLayoutManager(this,
        LinearLayoutManager.VERTICAL,false)

        //Add data source
        var vaccineslist:ArrayList<VaccineModel> =ArrayList()

        val v1  = VaccineModel("COVID-19",R.drawable.vaccine1)
        val v2  = VaccineModel("Hepatitis B Vaccine", R.drawable.vaccine4)
        val v3  = VaccineModel("Tatanus Vaccine", R.drawable.vaccine5)
        val v4  = VaccineModel("Pneumococal Vaccine", R.drawable.vaccine6)
        val v5  = VaccineModel("Rotavirus  Vaccine", R.drawable.vaccine7)
        val v6  = VaccineModel("Measles Vaccine", R.drawable.vaccine8)
        val v7  = VaccineModel("Chickenpox Vaccine", R.drawable.vaccine9)
        val v8=VaccineModel("Polio",R.drawable.vaccine10)

        vaccineslist.add(v1)
        vaccineslist.add(v2)
        vaccineslist.add(v3)
        vaccineslist.add(v4)
        vaccineslist.add(v5)
        vaccineslist.add(v6)
        vaccineslist.add(v7)
        vaccineslist.add(v8)
        //Adapeter
        val adapter=MyAdapter(vaccineslist)
        recyclerview.adapter=adapter
    }
}