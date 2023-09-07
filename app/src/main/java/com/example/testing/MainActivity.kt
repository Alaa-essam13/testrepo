package com.example.testing

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           // appl()
            navdraw()
        }

    }

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun appl(){
    
        Scaffold (topBar = { Topbar()},
            content = {
                Column{
                     test()
                     LowerPanel()
            }
            })

}
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Composable
    fun MyScreen() {
        Scaffold(
            topBar = {
                Topbar()
            }) {
                contentPadding ->
                             Column(modifier = Modifier.padding(contentPadding))
                             {
                                test()
                                LowerPanel()
                             }
        }
    }
    @Preview
    @Composable
    fun prevtest(){
        navdraw()
    }




}