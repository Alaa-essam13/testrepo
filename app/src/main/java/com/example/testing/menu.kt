package com.example.testing

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun menu(){
//    List(10){ Text(text = "Item $it", modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp))}
//    IconButton(onClick = { }) {
//        Image(painter = painterResource(id = R.drawable.menu), contentDescription ="Exit" )
//    }
//}

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.*

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun DrawerMenu() {

    Scaffold(
        topBar = {
            // Add your top app bar here
        }){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                // Add menu items here
                Text("Menu Item 1")
                Text("Menu Item 2")
                Text("Menu Item 3")

            }
        }

}
