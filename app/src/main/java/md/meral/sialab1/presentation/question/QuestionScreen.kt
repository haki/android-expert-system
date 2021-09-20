package md.meral.sialab1.presentation.question

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import md.meral.sialab1.presentation.ui.theme.AwsColor1
import md.meral.sialab1.presentation.ui.theme.AwsTextColor1
import md.meral.sialab1.presentation.ui.theme.AwsTextColor2
import md.meral.sialab1.presentation.util.Node
import md.meral.sialab1.presentation.util.Screen
import md.meral.sialab1.R
import md.meral.sialab1.presentation.ui.theme.Shapes

@Composable
fun QuestionScreen(navController: NavController) {

    val node = Node.node

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        if (node?.children?.isEmpty() == true) {
            Box(
                modifier = Modifier.border(BorderStroke(5.dp, SolidColor(AwsColor1))).padding(24.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.recommended_minimum_system_requirement),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = AwsTextColor1,
                    textAlign = TextAlign.Center,
                )
            }
        }

        Text(
            text = node!!.value,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(24.dp),
            color = AwsTextColor2,
            textAlign = TextAlign.Center,
        )

        if (node.children.isEmpty()) {

            Button(
                onClick = {
                    navController.navigate(Screen.HomeScreen.route)
                },

                modifier = Modifier
                    .padding(bottom = 6.dp, start = 24.dp, end = 24.dp)
                    .fillMaxWidth(),

                colors = ButtonDefaults.buttonColors(backgroundColor = AwsColor1)
            ) {
                Text(
                    text = stringResource(id = R.string.back_to_start),
                    color = AwsTextColor1,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                )
            }
        } else {

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

                    modifier = Modifier
                        .padding(bottom = 6.dp, start = 24.dp, end = 24.dp)
                        .fillMaxWidth(),

                    colors = ButtonDefaults.buttonColors(backgroundColor = AwsColor1)
                ) {
                    Text(
                        text = value.value,
                        color = AwsTextColor1,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                    )
                }
            }
        }
    }
}