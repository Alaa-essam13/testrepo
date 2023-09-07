package com.example.testing

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MessageCard() {
    val context= LocalContext.current
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        
        Image(
            painter = painterResource(id = R.drawable.littlelemonlogo),
            contentDescription = "little limon"
        )
        TextField(value = "", onValueChange = {},Modifier.padding(top = 20.dp), label = { Text(text = "Username") })
        TextField(value = "", onValueChange = {},Modifier.padding(top = 20.dp), label = { Text(text = "password") })
        Button(
            onClick = { Toast.makeText(context,"Hello worrrrrrrld", Toast.LENGTH_LONG).show()},
            Modifier.padding(top = 20.dp),
            colors = ButtonDefaults.buttonColors(
                Color(0xFF495E57),

            )
        ) {
            Text(
                text = "Login",
                color = Color(0xFFEDEFEE)
            )
        }
    }
}