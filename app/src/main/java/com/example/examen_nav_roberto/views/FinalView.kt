package com.example.examen_nav_roberto.views

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.examen_nav_roberto.components.MainCard
import com.example.examen_nav_roberto.components.MainIconButton
import com.example.examen_nav_roberto.components.TitleBar
import com.example.examen_nav_roberto.viewModel.SharedViewModel

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun FinalView(navController: NavController, viewModel: SharedViewModel, number: Int, name: String, color: Color) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar(name = "Aprende números en inglés", color) },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                navigationIcon = {
                    MainIconButton(icon = Icons.AutoMirrored.Filled.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }
    ) {
        ContentFinalView(navController, viewModel, number, name, color)
    }
}

@Composable
fun ContentFinalView(navController: NavController, viewModel: SharedViewModel, number: Int, name: String, color: Color) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center)
    ) {
        MainCard(title = number.toString(), number = name, color = color)
    }
}
