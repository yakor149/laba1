package com.example.laba1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)
        AnimalDescription()
    }
    fun AnimalDescription(){
        val name = intent.getStringExtra("name")
        var age = intent.getStringExtra("age")
        age += " років"
        val info = intent.getStringExtra("info")
        val rename = findViewById<TextView>(R.id.animal_name)
        val reage = findViewById<TextView>(R.id.animal_age)
        val reinfo = findViewById<TextView>(R.id.animal_info)
        rename.text = name
        reage.text = age
        reinfo.text = info
    }
}