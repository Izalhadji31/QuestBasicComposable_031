package com.example.layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
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
        Text(text = "ini halaman Login", fontSize = 22.sp, fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold, color = Color.Black)
        Image(painter = painterResource(id = R.drawable.logoumy),
            contentDescription = null,
            modifier = izal.size(180.dp)
                .padding(top = 10.dp)
        )
        Text(text = "Nama", fontSize = 23.sp, fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Green, // Menambahkan warna hijau untuk bayangan
                    offset = Offset(2f, 2f),  // Mengatur offset shadow
                    blurRadius = 4f  // Mengatur seberapa buram bayangan
                )
            )
        )
        Text(text = "MUH. SYAFRIZAL H.A.", fontSize =25.sp, fontWeight =
        FontWeight.Bold, color = Color.Black)
        Text(text = "20220140031", fontSize = 25.sp,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Green, // Menambahkan warna hijau untuk bayangan
                    offset = Offset(2f, 2f),  // Mengatur offset shadow
                    blurRadius = 4f  // Mengatur seberapa buram bayangan
                )
            )
        )
        Box(
            modifier = izal
                .size(500.dp),
            contentAlignment = Alignment.Center  // Mengatur konten di tengah
        ){

            Box(
                modifier = izal
                    .size(480.dp)
                    .clip(CircleShape)
                    .background(Color.Black.copy(alpha = 0.6f))
            )
            Image(
                painter = painterResource(id = R.drawable.ijal),
                contentDescription = null,
                modifier = izal
                    .size(480.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }
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
