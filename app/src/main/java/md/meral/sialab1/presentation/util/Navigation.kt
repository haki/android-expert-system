package md.meral.sialab1.presentation.util

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import md.meral.sialab1.MainActivity
import md.meral.sialab1.presentation.home.HomeScreen
import md.meral.sialab1.presentation.question.QuestionScreen
import md.meral.sialab1.presentation.splash.SplashScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.SplashScreen.route) {
        composable(Screen.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        
        composable(Screen.HomeScreen.route) {
            HomeScreen(navController = navController)
        }

        composable(Screen.QuestionScreen.route) {
            QuestionScreen(navController = navController)
        }
    }
}