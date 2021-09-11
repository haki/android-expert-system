package md.meral.sialab1.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import md.meral.sialab1.presentation.util.Screen

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Bine ati venit!",
            fontWeight = FontWeight.Bold,
            fontSize = 52.sp,
            modifier = Modifier.padding(bottom = 50.dp),
            color = Color(0xFF757575)
        )

        Button(
            onClick = {
                navController.navigate(Screen.QuestionScreen.route)
            },

            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF4CAF50))
        ) {
            Text(
                text = "Incepe la alegerea!",
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFFFFFF),
                modifier = Modifier.padding(24.dp),
                fontSize = 24.sp
            )
        }
    }
}