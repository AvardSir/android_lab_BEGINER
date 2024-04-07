

package com.example.lybrary6

import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup
import  androidx.recyclerview.widget.RecyclerView
import com.example.lybrary6.databinding.LibReaderItemBinding

//import androidx.databinding.livreader_item.databinding.livreader_itemBinding
class lib_adapter: RecyclerView.Adapter<lib_adapter.lib_holder> (){

    class lib_holder(item: View): RecyclerView.ViewHolder (item){
        val binding=LibReaderItemBinding.bind(item)
            //first
        fun bind(data_lib: Pair<String, Int>)=with(binding){
            name.text=data_lib.first//data_lib.name
            Count.text= data_lib.second.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): lib_holder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.lib_reader_item,parent,false)
        return lib_holder(view)
    }

    override fun getItemCount(): Int {
        return MyApplication.globalVariable.size

    }

    override fun onBindViewHolder(holder: lib_holder, position: Int) {
        holder.bind(MyApplication.globalVariable[position])
    }
}