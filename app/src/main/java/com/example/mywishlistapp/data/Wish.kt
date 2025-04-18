package com.example.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title="맥북 최신형", description = "2025년 m5"),
        Wish(title="맥북 구형", description = "2020년 m5"),
        Wish(title="맥북 현재형", description = "2025년 m5"),
    )
}