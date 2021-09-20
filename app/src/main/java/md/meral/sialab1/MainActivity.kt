package md.meral.sialab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import md.meral.sialab1.presentation.question.Questions
import md.meral.sialab1.presentation.ui.theme.AwsColor3
import md.meral.sialab1.presentation.ui.theme.SIALab1Theme
import md.meral.sialab1.presentation.util.Navigation
import md.meral.sialab1.presentation.util.Node
import java.util.*

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()
            Node.node = Questions().createBinaryTree()

            SIALab1Theme {
                Box(
                    modifier = Modifier
                        .background(color = AwsColor3)
                        .fillMaxSize()
                ) {
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
            } else if (Node.node?.parent?.children?.size!! >= 2) {
                Node.node = Node.node?.parent
            }
        }
    }
}