package com.example.laba1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

data class Animal (
    val name: String,
    var age: String,
    var info: String
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val monkey = Animal("Чіпсик", "5", "Любить їсти банани")
    val parrot = Animal("Джонік", "12", "Любить літати і рунувати свою клітку")
    val spider = Animal("Павук", "4", "Павук")

    fun onClickOpenSecondaryMonkey(view: View) {
        val intent = Intent(this, SecondaryActivity::class.java)
        intent.putExtra("name", monkey.name)
        intent.putExtra("age", monkey.age)
        intent.putExtra("info", monkey.info)

        startActivity(intent)
    }
    fun onClickOpenSecondaryParrot(view: View) {
        val intent = Intent(this, SecondaryActivity::class.java)
        intent.putExtra("name", parrot.name)
        intent.putExtra("age", parrot.age)
        intent.putExtra("info", parrot.info)
        startActivity(intent)
    }
    fun onClickOpenSecondarySpider(view: View) {
        val intent = Intent(this, SecondaryActivity::class.java)
        intent.putExtra("name", spider.name)
        intent.putExtra("age", spider.age)
        intent.putExtra("info", spider.info)
        startActivity(intent)
    }

}