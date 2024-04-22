package com.example.lybrary6

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "items")
data class Item (
    @PrimaryKey(autoGenerate = true)
    var id:Int?=null,
    @ColumnInfo(name="name")
    var name: String,
    @ColumnInfo(name="Count_of_books")
    var Count_of_books: Int
)