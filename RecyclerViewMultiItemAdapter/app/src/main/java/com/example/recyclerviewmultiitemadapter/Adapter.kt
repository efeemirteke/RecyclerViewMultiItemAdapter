package com.example.recyclerviewmultiitemadapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.isandroid_layout.view.*
import kotlinx.android.synthetic.main.isnotandroid.view.*

class Adapter(val context: Context,val arrayList:ArrayList<isAndroid>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun getItemCount(): Int {
        return arrayList.size
    }
    override fun getItemViewType(position: Int): Int {
        if(arrayList[position].isAndroid==true){
            return 1
        }
        return 0
        return super.getItemViewType(position)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater=LayoutInflater.from(context)
        if(viewType==1){
            val view=inflater.inflate(R.layout.isandroid_layout,parent,false)
            return isAndroidViewHolder(view)
        }
        val view=inflater.inflate(R.layout.isnotandroid,parent,false)
        return isNotAndroidViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(arrayList[position].isAndroid==true){
            val isAndroidHolder=holder as isAndroidViewHolder
            isAndroidHolder.verileriYerlestir(position)
        }
        else{
            val isNotAndroidHolder=holder as isNotAndroidViewHolder
            isNotAndroidHolder.verileriYerlestir(position)
        }
    }
    inner class isAndroidViewHolder(val itemView:View):RecyclerView.ViewHolder(itemView){
        lateinit var tvLanguage:TextView
        lateinit var imgLanguage:ImageView
        lateinit var checkBox: CheckBox

        init {
            this.tvLanguage=itemView.tvLanguage
            this.imgLanguage=itemView.imgLanguage
            this.checkBox=itemView.checkBox
        }
        fun verileriYerlestir(position:Int){
            tvLanguage.text=arrayList[position].title
            imgLanguage.setImageResource(arrayList[position].img)
        }
    }
    inner class isNotAndroidViewHolder(val itemView:View):RecyclerView.ViewHolder(itemView){
        lateinit var tvLanguage:TextView
        lateinit var imgLanguage:ImageView
        init {
            this.tvLanguage=itemView.tvLanguage2
            this.imgLanguage=itemView.imgLanguage2
        }
        fun verileriYerlestir(position:Int){
            tvLanguage.text=arrayList[position].title
            imgLanguage.setImageResource(arrayList[position].img)
        }
    }

}