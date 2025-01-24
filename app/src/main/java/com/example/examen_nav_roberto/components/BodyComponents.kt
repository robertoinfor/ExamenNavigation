package com.example.examen_nav_roberto.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TitleView(name: String, color: Color){
    Text(text = name, fontSize = 40.sp, fontWeight = FontWeight.Bold, color = color)
}

@Composable
fun MainButton(name: String, backColor: Color, color: Color, onClick:() -> Unit){
    Button(onClick = onClick, colors = ButtonDefaults.buttonColors(
        contentColor = color,
        containerColor = backColor,
    ) ) {
        Text(text = name)
    }
}

@Composable
fun SpaceH(size: Dp = 5.dp) {
    Spacer(modifier = Modifier.height(size))
}

@Composable
fun SpaceW(size: Dp = 5.dp) {
    Spacer(modifier = Modifier.width(size))
}

@Composable
fun MainCard(title: String, number: String, color: Color, modifier: Modifier = Modifier){
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = title, color = color, fontSize = 30.sp)
            Text(text = number, color = color, fontSize = 30.sp)
        }
    }
}