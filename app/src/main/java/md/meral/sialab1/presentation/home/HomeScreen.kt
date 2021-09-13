package md.meral.sialab1.presentation.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import md.meral.sialab1.R
import md.meral.sialab1.presentation.util.Screen

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.welcome),
            fontWeight = FontWeight.Bold,
            fontSize = 52.sp,
            modifier = Modifier.padding(bottom = 50.dp),
            color = Color(0xFF757575)
        )

        Button(
            onClick = {
                navController.navigate(Screen.QuestionScreen.route)
            },

            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF4CAF50)),
            modifier = Modifier.padding(start = 24.dp, end = 24.dp)
        ) {
            Text(
                text = stringResource(id = R.string.start),
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFFFFFF),
                modifier = Modifier.fillMaxWidth(),
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}