package com.example.testing

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun test(){
    var c= LocalContext.current
    Column (verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF495E57))
            .padding(top = 21.dp)

    ){
        Text(text = "Littlle Lemon",
            Modifier.padding(start = 20.dp, end = 20.dp), Color(0xfff4ce14), fontSize = 32.sp)
        Text(text = "Chicago", Modifier.padding(start = 20.dp), color = Color(0xFFFFFFFF), fontSize = 24.sp)
        Row (
            Modifier
                .fillMaxWidth()
                .padding(20.dp), horizontalArrangement = Arrangement.Start){
            Text(text = stringResource(id = R.string.dis),
                Modifier.width(200.dp),
                color = Color.White, fontSize = 21.sp
            )


            Image(painter = painterResource(id = R.drawable.littlelemonlogo),
                contentDescription ="",
                Modifier
                    .height(200.dp)
                    .padding(horizontal = 25.dp)
                    .clip(RoundedCornerShape(25.dp))
                    )
        }
        Button(
            onClick = { Toast.makeText(c,"Hello in our app",Toast.LENGTH_LONG).show() },
            colors = ButtonDefaults.buttonColors(Color(0xfff4ce14)),
            modifier = Modifier.padding(horizontal = 20.dp)
        ) {
            Text(
                text = "Login",
                color = Color(0xFFEDEFEE)
            )
        }
    }
}
@Preview
@Composable
fun pre(){
    test()
}