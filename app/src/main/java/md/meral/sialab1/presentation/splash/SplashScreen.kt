package md.meral.sialab1.presentation.splash

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import md.meral.sialab1.R
import md.meral.sialab1.presentation.util.Constants
import md.meral.sialab1.presentation.util.Screen

@Composable
fun SplashScreen(navController: NavController) {

    val scale = remember {
        Animatable(0f)
    }

    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 1.5f,
            animationSpec = tween(durationMillis = Constants.SPLASH_SCREEN_DURATION)
        )

        delay(Constants.SPLASH_SCREEN_DELAY)

        scale.animateTo(
            targetValue = 0f,
            animationSpec = tween(durationMillis = Constants.SPLASH_SCREEN_DURATION)
        )

        navController.popBackStack()
        navController.navigate(Screen.HomeScreen.route)
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.hm_transparent),
            contentDescription = "Logo",
            Modifier.scale(scale.value)
        )
    }
}