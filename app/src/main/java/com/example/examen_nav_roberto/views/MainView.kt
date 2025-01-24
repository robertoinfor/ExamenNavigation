package com.example.examen_nav_roberto.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.examen_nav_roberto.components.MainButton
import com.example.examen_nav_roberto.components.MainIconButton
import com.example.examen_nav_roberto.components.TitleBar
import com.example.examen_nav_roberto.components.TitleView
import com.example.examen_nav_roberto.viewModel.SharedViewModel

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeView(navController: NavController, viewModel: SharedViewModel, color: Color){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar(name = "Aprende números en inglés", color) },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) {
        ContentHomeView(navController, viewModel, color)

    }
}

@Composable
fun ContentHomeView(navController: NavController, viewModel: SharedViewModel, color: Color){
    Column (modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    ){
        TitleView(name = "Números en inglés", color = color)
        MainButton(name = "Crear lista", backColor = MaterialTheme.colorScheme.primary, color = color) {
            viewModel.generateList()
            navController.navigate("List")
        }
    }
}