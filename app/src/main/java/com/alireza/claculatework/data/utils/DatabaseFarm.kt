package com.alireza.claculatework.data.utils

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.alireza.claculatework.data.model.Season
import com.alireza.claculatework.data.dao.FarmDao
import com.alireza.claculatework.data.model.Day
import com.alireza.claculatework.data.model.Worker

@Database(entities = [Season::class, Day::class, Worker::class], version = 1, exportSchema = true)
@TypeConverters(TypeConverter::class)

abstract class DatabaseFarm : RoomDatabase() {
    abstract fun farmDao(): FarmDao

//    companion object {
//        private var INSTANCE: DatabaseFarm? = null
//        fun getDatabase(context: Context): DatabaseFarm {
//            val temp = INSTANCE
//            if (temp != null) {
//                return temp
//            }
//            synchronized(this) {
//                val instance =
//                    Room.databaseBuilder(
//                        context.applicationContext,
//                        DatabaseFarm::class.java,
//                        "DatabaseFarm"
//                    ).build()
//
//                INSTANCE = instance
//                return instance
//            }
//        }
//    }
}