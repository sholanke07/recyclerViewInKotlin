package com.example.recyclerviewinkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_text.view.*
import java.text.ParsePosition



class MyListAdapter (private val context: Context, private val myList: ArrayList<String>):
        RecyclerView.Adapter<MyListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, position:Int): ViewHolder {
            val myListItem = LayoutInflater.from(context)
                    .inflate(R.layout.item_text, viewGroup, false)
            return ViewHolder(myListItem)
        }
    override fun getItemCount(): Int {
        return myList.size
    }
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(myList[position])
    }
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(myItem: String){
                itemView.item_text.text = myItem
                itemView.setOnClickListener {
                    Toast.makeText(context, myItem, Toast.LENGTH_LONG).show()
                }
            }
        }
    }