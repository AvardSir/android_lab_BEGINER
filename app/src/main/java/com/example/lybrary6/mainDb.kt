package com.example.lybrary6

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.security.AccessControlContext
@Database(entities = [Item::class], version = 1)
abstract class mainDb: RoomDatabase() {
    abstract fun getDao():Dao
    companion object {
        fun getDb(context: Context):mainDb{
            return Room.databaseBuilder(
                context.applicationContext,
                mainDb::class.java,
                "text.db"
            ).build()
        }
    }
}
