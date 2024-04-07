package com.example.lybrary6

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.viewbinding.ViewBinding
import com.example.lybrary6.databinding.ActivityBasicViews2Binding



class basic_views2 : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityBasicViews2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        var i: Int = 0
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_views2)

        val textView_name = findViewById<TextView>(R.id.textView_name)
        textView_name.text = MyApplication.globalVariable[0].first // Устанавливаем новый текст
        val textView_count = findViewById<TextView>(R.id.textView_count)
        textView_count.text = MyApplication.globalVariable[0].second.toString() // Устанавливаем новый текст

        // В вашей активити
        val button3 = findViewById<Button>(R.id.button3)

        button3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            // Ваши действия при нажатии на кнопку
        }

        val Recycler_to = findViewById<Button>(R.id.Recycler_to)

        Recycler_to.setOnClickListener {
            val intent = Intent(this, RecyclerView::class.java)
            startActivity(intent)
            // Ваши действия при нажатии на кнопку
        }

        val button_left = findViewById<Button>(R.id.button_left)
        button_left.setOnClickListener {
            if (i>0){
                i=i-1
                textView_name.text = MyApplication.globalVariable[i].first
                textView_count.text = MyApplication.globalVariable[i].second.toString()
            }
            // Ваши действия при нажатии на кнопку
        }


        val button_right = findViewById<Button>(R.id.button_right)
        button_right.setOnClickListener {
            if (i+1<MyApplication.globalVariable.size){
                i=i+1
                textView_name.text = MyApplication.globalVariable[i].first
                textView_count.text = MyApplication.globalVariable[i].second.toString()
            }
             // Устанавливаем новый текст
            //val textView_count = findViewById<TextView>(R.id.textView_count)

            // Ваши действия при нажатии на кнопку
        }
        val button_add_reader = findViewById<Button>(R.id.button8)
        button_add_reader.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            // Ваши действия при нажатии на кнопку
        }

        val button_plus = findViewById<Button>(R.id.button_plus)
        button_plus.setOnClickListener {

                textView_name.text = MyApplication.globalVariable[i].first
                //MyApplication.globalVariable[i].second=MyApplication.globalVariable[i].second+1
                MyApplication.globalVariable[i] =
                    MyApplication.globalVariable[i].copy(second = MyApplication.globalVariable[i].second + 1)
            textView_count.text = MyApplication.globalVariable[i].second.toString()

        }

        val button_minus = findViewById<Button>(R.id.button_minus)
        button_minus.setOnClickListener {

            textView_name.text = MyApplication.globalVariable[i].first
            //MyApplication.globalVariable[i].second=MyApplication.globalVariable[i].second+1
            if (MyApplication.globalVariable[i].second!=0){
                MyApplication.globalVariable[i] =
                    MyApplication.globalVariable[i].copy(second = MyApplication.globalVariable[i].second - 1)
                textView_count.text = MyApplication.globalVariable[i].second.toString()
            }


        }
    }


}


