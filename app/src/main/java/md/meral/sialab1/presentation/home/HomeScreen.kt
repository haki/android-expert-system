package md.meral.sialab1.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import md.meral.sialab1.R
import md.meral.sialab1.presentation.question.Questions
import md.meral.sialab1.presentation.ui.theme.AwsTextColor1
import md.meral.sialab1.presentation.util.Node
import md.meral.sialab1.presentation.util.Screen

@Composable
fun HomeScreen(navController: NavController) {
    Node.node = Questions().createBinaryTree()

    val scaffoldState = rememberScaffoldState()

    Scaffold(
        scaffoldState = scaffoldState,
        bottomBar = {
            BottomAppBar(cutoutShape = CircleShape) {

            }
        },

        floatingActionButton = {
            ExtendedFloatingActionButton(
                text = { Text(text = stringResource(id = R.string.start)) },
                onClick = { navController.navigate(Screen.QuestionScreen.route) }
            )
        },

        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true,
        content = {
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
                    color = AwsTextColor1
                )
            }
        }
    )
}