package md.meral.sialab1.presentation.util

sealed class Screen(val route: String) {
    object SplashScreen: Screen("splash_screen")
    object HomeScreen: Screen("home_screen")
    object QuestionScreen: Screen("question_screen")
}