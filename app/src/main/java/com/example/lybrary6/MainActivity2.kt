package com.example.lybrary6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name = findViewById<TextView>(R.id.editTextText)
        val count = findViewById<TextView>(R.id.editTextText2)
        //textView_name.text = MyApplication.globalVariable[0].first // Устанавливаем новый текст

        val button_add = findViewById<Button>(R.id.button_add)
        button_add.setOnClickListener {
            MyApplication.globalVariable.add(Pair(name.text.toString(),count.text.toString().toInt()))
        }
        val button_home = findViewById<Button>(R.id.button_home)
        button_home.setOnClickListener {
            val intent = Intent(this, basic_views2::class.java)
            startActivity(intent)
        }
    }
}