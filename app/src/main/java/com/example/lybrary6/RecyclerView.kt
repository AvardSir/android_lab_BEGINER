package com.example.lybrary6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView.Recycler
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lybrary6.databinding.ActivityRecyclerViewBinding

class RecyclerView : AppCompatActivity() {

    lateinit var binding: ActivityRecyclerViewBinding
    private  val adapter = lib_adapter()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        // binding=androidx.recyclerview.widget.RecyclerView.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    private fun init(){
        binding.apply {
            rcView.layoutManager=LinearLayoutManager(this@RecyclerView)
            rcView.adapter=adapter
        }
    }
}