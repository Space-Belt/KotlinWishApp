package com.example.mywishlistapp

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add

import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mywishlistapp.data.DummyWish
import com.example.mywishlistapp.data.Wish

@Composable
fun HomeView(
    navController: NavController,
    viewModel: WishViewModel
) {
    val context = LocalContext.current
    Scaffold(
        topBar = { AppBarView(title = "WishList", {
            Toast.makeText(context, "버튼 클릭", Toast.LENGTH_LONG).show()
        }) },
        floatingActionButton = {
            FloatingActionButton(
                modifier = Modifier.padding(all = 20.dp),
                contentColor = Color.White,
                backgroundColor = Color.Black,
                onClick = {
                    Toast.makeText(context, "떠있는 버튼 클릭", Toast.LENGTH_LONG).show()
                    navController.navigate(Screen.AddScreen.route)
                }
            ) {
                Icon(
                    imageVector = Icons.Default.Add, contentDescription = null, tint = Color.White
                )
            }
        }
    ){
        LazyColumn (
            modifier = Modifier.fillMaxSize().padding(it)
        ){
            items(DummyWish.wishList) {
                wish -> WishItem(wish = wish) {

            }
            }
        }
    }
}

@Composable
fun WishItem(wish: Wish, onClick: () -> Unit) {
    Card  (
        modifier = Modifier.fillMaxSize().
        padding(top = 8.dp, end = 8.dp)
            .clickable{
            onClick()
        },
        elevation = 10.dp,
        backgroundColor = Color.White
        ) {
        Column (modifier = Modifier.padding(16.dp)) {
            Text(text = wish.title, fontWeight = FontWeight.ExtraBold)
            Text(text = wish.description, fontWeight = FontWeight.ExtraBold)
        }
    }
}