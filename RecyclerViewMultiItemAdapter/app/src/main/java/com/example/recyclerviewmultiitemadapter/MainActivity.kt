package com.example.recyclerviewmultiitemadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
     var languageArrayList=ArrayList<isAndroid>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        verileriYerlestir()
        val adapter=Adapter(this,languageArrayList)
        recyclerView.adapter=adapter
        val layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView.layoutManager=layoutManager

    }
    private fun verileriYerlestir(){
        val bilgiler=LanguagesObject.verileriYerlestir()
        languageArrayList.addAll(bilgiler)
    }

}