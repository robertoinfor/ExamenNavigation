package com.example.examen_nav_roberto.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.examen_nav_roberto.viewModel.SharedViewModel
import com.example.examen_nav_roberto.views.FinalView
import com.example.examen_nav_roberto.views.HomeView
import com.example.examen_nav_roberto.views.ListView

@Composable
fun NavManager(viewModel: SharedViewModel, color: Color){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home") {
        composable("Home") {
            HomeView(navController, viewModel, color)
        }
        composable("List"){
            ListView(navController, viewModel, color)
        }
        composable("FinalView/{number}/{name}", arguments = listOf(
            navArgument("number"){
                type = NavType.IntType
            },
            navArgument("name"){
                type = NavType.StringType
            }
        )){
            val id = it.arguments?.getInt("number") ?: 0
            val name = it.arguments?.getString("name") ?: ""
            FinalView(navController, viewModel, id, name, color)
        }
    }
}