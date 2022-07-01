package com.example.srcompose

import android.app.Notification
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ButtonElevation
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.core.navigation.Route
import com.example.core.utils.UiEvent
import com.example.core_ui.LocalSpacing
import com.example.onboarding_presentation.components.ActionButton
import com.example.onboarding_presentation.welcome.WelcomeScreen
import com.example.srcompose.navigation.navigate
import com.example.srcompose.ui.theme.Shapes
import com.example.srcompose.ui.theme.SrComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SrComposeTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Route.WELCOME
                ) {
                    composable(Route.WELCOME) {
                        RowTextView()
                    }
                    composable(Route.GENDER) {

                    }
                    composable(Route.AGE) {

                    }
                    composable(Route.HEIGHT) {

                    }
                    composable(Route.WEIGHT) {

                    }
                    composable(Route.GOAL) {

                    }
                    composable(Route.ACTIVITIES) {

                    }
                    composable(Route.NUTRIENT_GOAL) {

                    }
                    composable(Route.SEARCH) {

                    }
                    composable(Route.TRACKER_OVERVIEW) {

                    }
                }
            }
        }
    }

    private fun onClickActionButton() {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
    }
}

@Composable
fun UiShowWelcomeScreen(navController: NavHostController, navBackStackEntry: NavBackStackEntry) {
    WelcomeScreen {
        onClickNextInWelcomeScreen(navController, navBackStackEntry, it)
    }
}


fun onClickNextInWelcomeScreen(
    navController: NavHostController,
    navBackStackEntry: NavBackStackEntry,
    navigate: UiEvent.Navigate
) {
    navController.navigate(navigate.route)
}

@Composable
fun RootLayout(content: @Composable () -> Unit) {
    SrComposeTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            color = MaterialTheme.colors.background
        ) {
            content()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        Modifier
            .background(Color.Green)
            .padding(16.dp)
    )
}

@Composable
fun RowTextView() {
    Row(
        modifier = Modifier
            .wrapContentHeight()
            .background(Color.Magenta),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "textView 1 ",
            modifier = Modifier
                .padding(20.dp)
                .background(Color.Gray),
            color = Color.Blue,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = "textView 2 ",
            modifier = Modifier
                .background(Color.Cyan)
                .padding(50.dp),
            fontWeight = FontWeight.Bold,
        )
    }
}


@Composable
fun ActionButton() {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = {
                Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show()
            },
            enabled = true,
            shape = CircleShape,
            elevation = ButtonDefaults.elevation(),
            border = BorderStroke(4.dp, Color.Green),
            colors = ButtonDefaults.buttonColors(),
            modifier = Modifier
        ) {
            Text(
                text = "ButtonText",
                color = MaterialTheme.colors.onPrimary,
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.button
            )
        }
    }
}

@Composable
fun TextView() {
    val context = LocalContext.current
    Text(
        text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
        modifier = Modifier,
        color = Color.Magenta,
        fontSize = 20.sp,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.SansSerif,
        letterSpacing = 2.sp,
        textDecoration = TextDecoration.Underline,
        textAlign = TextAlign.Start,
        lineHeight = 2.sp,
        overflow = TextOverflow.Ellipsis,
        softWrap = true,
        maxLines = 1
    )
}

@Preview(showBackground = true)
@Composable
fun previewWelcomeScreen() {
    ActionButton(textOnButton = "test", onClick = { /*TODO*/ })
}






