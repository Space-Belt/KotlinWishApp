package com.example.mywishlistapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mywishlistapp.WishDao

@Database(
    entities = [Wish::class],
    version = 1,
    exportSchema = false
)

abstract class WishDatabase : RoomDatabase() {
    abstract fun wishDao(): WishDao
}