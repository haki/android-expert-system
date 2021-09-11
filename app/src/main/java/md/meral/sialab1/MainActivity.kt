package md.meral.sialab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import md.meral.sialab1.presentation.question.QuestionScreen
import md.meral.sialab1.presentation.question.Questions
import md.meral.sialab1.presentation.ui.theme.SIALab1Theme
import md.meral.sialab1.presentation.util.Constants
import md.meral.sialab1.presentation.util.Navigation
import md.meral.sialab1.presentation.util.Node
import md.meral.sialab1.presentation.util.Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val navController = rememberNavController()
            Node.node = Questions().createBinaryTree()

            SIALab1Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Navigation(navController = navController)
                }
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()

        if (Node.node?.parent != null) {
            if (Node.node?.parent?.children?.size!! == 1) {
                Node.node = Node.node?.parent?.parent
            } else if(Node.node?.parent?.children?.size!! >= 2) {
                Node.node = Node.node?.parent
            }
        }
    }
}