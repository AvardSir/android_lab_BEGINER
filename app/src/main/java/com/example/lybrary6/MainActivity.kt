package com.example.lybrary6

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class MyApplication : Application() {
    companion object {
        var globalVariable = mutableListOf<Pair<String,  Int>>(Pair("Жорж Жак Дантон", 2))

    }
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // В вашей активити
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this, basic_views2::class.java)
            startActivity(intent)
        }

    }
}