package com.example.srcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.onboarding_presentation.welcome.WelcomeScreen
import com.example.srcompose.ui.theme.SrComposeTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RootLayout {
                Greeting(name = "Android")
            }
        }
    }
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

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Magenta),
    ) {
        Text(
            text = "TextView 1",
            modifier = Modifier
                .wrapContentWidth()
                .background(Color.Gray),
            fontSize = 18.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold,
        )
        Spacer(
            modifier = Modifier.height(18.dp)
        )
        Text(
            text = "TextView 2",
            modifier = Modifier
                .background(Color.Cyan),
            style = MaterialTheme.typography.h4
        )
    }
}

@Preview(showBackground = true)
@Composable
fun previewWelcomeScreen() {
    WelcomeScreen()
}






