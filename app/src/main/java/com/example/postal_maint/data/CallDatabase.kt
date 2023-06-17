package com.example.postal_maint.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [CallEntity::class], version = 1, exportSchema = false)
abstract class CallDatabase : RoomDatabase {
    abstract fun callDao(): CallDao
    companion object {

    }
}