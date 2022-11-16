package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class PeopleAdapter( private val context: Context, private val nameList: List <NameList>, val listener : (NameList) -> Unit )
    :RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder>() {
    class PeopleViewHolder(view: View):RecyclerView.ViewHolder(view) {

        val imgPeople = view.findViewById<ImageView>(R.id.img_item_photo)
        val namePeople = view.findViewById<TextView>(R.id.tv_item_name)
        val descPeople = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(nameList: NameList, listener: (NameList) -> Unit){
            imgPeople.setImageResource(nameList.imgPeople)
            namePeople.text = nameList.namePeople
            descPeople.text = nameList.descPeople
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
        return PeopleViewHolder(
            LayoutInflater.from(context).inflate(R.layout.layout_recyclerview, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        holder.bindView(nameList[position], listener)
    }

    override fun getItemCount(): Int = nameList.size
    }
