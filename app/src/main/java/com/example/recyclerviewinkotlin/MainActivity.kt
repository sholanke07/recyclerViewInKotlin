package com.example.recyclerviewinkotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.item_text.view.*

class MainActivity : AppCompatActivity() {

    var myList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnsave = findViewById<Button>(R.id.save)
        val editname = findViewById<EditText>(R.id.edit_text)
        val editemail = findViewById<EditText>(R.id.edit_text2)
        val recyclerview: RecyclerView = findViewById(R.id.recyclerView)
        val myAdapter = MyListAdapter(this, myList)

        btnsave.setOnClickListener {
            val name = editname.text
            val email =editemail.text
            myList.add(name.toString() + "\n" + email.toString())
            myAdapter.notifyDataSetChanged()

            editname.setText(" ")
            editemail.setText(" ")
        }

        recyclerview.adapter = myAdapter
        recyclerview.layoutManager = LinearLayoutManager(this)
        val decorator = DividerItemDecoration(applicationContext, LinearLayoutManager.VERTICAL)
        recyclerview.addItemDecoration(decorator)

    }
}





