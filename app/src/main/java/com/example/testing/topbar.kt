package com.example.testing

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Topbar(){
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
        ){
        IconButton(onClick = { DrawerValue.Open }) {
            Image(painter = painterResource(id = R.drawable.menu),
                contentDescription = "menue",
                Modifier.size(24.dp))
        }
        Image(painter = painterResource(id = R.drawable.r),
            contentDescription = "Little limon logo",
            Modifier
                .fillMaxWidth(0.5F)
                .padding(horizontal = 20.dp))
        IconButton(onClick = { /*TODO*/ }) {
            Image(painter = painterResource(id = R.drawable.addtocart), contentDescription = "menue",Modifier.size(24.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun tes(){
Topbar()
}