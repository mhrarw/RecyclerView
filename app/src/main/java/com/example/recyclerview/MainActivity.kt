package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val namelistList = listOf<NameList>(
            NameList(
                R.drawable.aster,
                "Aster",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            ),
            NameList(
                R.drawable.aster,
                "Aster",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            ),
            NameList(
                R.drawable.aster,
                "Aster",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            ),
            NameList(
                R.drawable.aster,
                "Aster",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            ),
            NameList(
                R.drawable.aster,
                "Aster",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            ),
            NameList(
                R.drawable.aster,
                "Aster",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_name)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = PeopleAdapter(this,namelistList){

        }
    }
}