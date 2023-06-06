package com.example.easytospeak

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class LearnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)
        val itemslist:RecyclerView=findViewById((R.id.recycle))
        itemslist.adapter = ItemAdapter(this, ItemsList().list)
    }
}