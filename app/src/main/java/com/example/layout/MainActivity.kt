package com.example.layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layout.ui.theme.LayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LayoutTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    BasicCompose(
                        izal = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Composable
fun BasicCompose(izal: Modifier = Modifier){
    Column (
        modifier = izal
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Login", fontSize = 30.sp, fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Green, // Menambahkan warna hijau untuk bayangan
                    offset = Offset(2f, 2f),  // Mengatur offset shadow
                    blurRadius = 4f  // Mengatur seberapa buram bayangan
                )
            )
        )

        Text(
            "Versus",
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 50.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Red,
            )

        )
        Image(painter = painterResource(id = R.drawable.download),
            contentDescription = null,
            modifier = izal.size(200.dp)
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LayoutTheme {
        Greeting("Android")
    }
}
