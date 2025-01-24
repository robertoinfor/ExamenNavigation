package com.example.examen_nav_roberto

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.examen_nav_roberto.ui.theme.Examen_Nav_RobertoTheme
import com.example.examen_nav_roberto.viewModel.SharedViewModel
import com.example.examen_nav_roberto.navigation.NavManager

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val alumno2 = Color(0xFFFFD180)
        val viewModel: SharedViewModel by viewModels()
        setContent {
            Examen_Nav_RobertoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    NavManager(viewModel = viewModel, alumno2)
                }
            }
        }
    }
}