package com.example.lybrary6

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.asLiveData
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.lybrary6.databinding.ActivityDbBinding




import android.content.Intent


import android.widget.Button
import android.widget.TextView
class Db : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
private lateinit var binding: ActivityDbBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     binding = ActivityDbBinding.inflate(layoutInflater)
     setContentView(binding.root)
        val db=mainDb.getDb(this)
        db.getDao().getAlldata().asLiveData().observe(this){


            MyApplication.globalVariable=mutableListOf<Pair<String,  Int>>(Pair("Жорж Жак Дантон", 2))
            it.forEach {

                MyApplication.globalVariable.add(Pair(it.name, it.Count_of_books.toInt()))
            }


        }
    binding.idsave.setOnClickListener{
        val item=Item(null,
            binding.Name.text.toString(),
            binding.CountInput.text.toString()
        )
        Thread{
            db.getDao().insertItem(item)
        }.start()
    }






    }



}