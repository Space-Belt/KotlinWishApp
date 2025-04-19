package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-description")
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title="맥북 최신형", description = "2025년 m5"),
        Wish(title="맥북 구형", description = "2020년 m5"),
        Wish(title="맥북 현재형", description = "2025년 m5"),
    )
}