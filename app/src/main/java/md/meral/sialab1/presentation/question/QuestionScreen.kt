package md.meral.sialab1.presentation.question

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import md.meral.sialab1.MainActivity
import md.meral.sialab1.presentation.util.BinaryNode
import md.meral.sialab1.presentation.util.Constants
import md.meral.sialab1.presentation.util.Node
import md.meral.sialab1.presentation.util.Screen

@Composable
fun QuestionScreen(navController: NavController) {

    val node = Node.node

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = node!!.value,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(24.dp),
            color = Color(0xFF757575),
            textAlign = TextAlign.Center,
        )

        for (value in node.children) {
            Button(
                onClick = {
                    if (value.children.size == 1) {
                        Node.node = value.children.first()
                    } else if(value.children.size >= 2) {
                        Node.node = value
                    }
                    navController.navigate(Screen.QuestionScreen.route)
                },

                modifier = Modifier.padding(bottom = 6.dp, start = 24.dp, end = 24.dp).fillMaxWidth(),

                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF4CAF50))
            ) {
                Text(
                    text = value.value,
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                )
            }
        }
    }
}