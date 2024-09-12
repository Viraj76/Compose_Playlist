package com.appsv.composeplaylist

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appsv.composeplaylist.ui.theme.ComposePlaylistTheme
import kotlin.math.truncate


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposePlaylistTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
            }
            }
        }
    }
}

@Composable
fun add() {

}

@Composable
fun add2() {

}

@Composable
fun add3() {

}

@Composable
fun add4() {

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//    Button(onClick = { /*TODO*/ }) {
//        Text(text = "Yes")
//    }
}
@Composable
fun LudoBoardWithCorners() {
    // Main Ludo board
    Box(
        modifier = Modifier
            .size(300.dp)
            .background(Color.Cyan) // Main board background color,
        , contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .padding(5.dp)
                .clip(RoundedCornerShape(6.dp))
                .background(Color.DarkGray),
            contentAlignment = Alignment.Center
        ){
            Text(text = "Ludo Board", color = Color.White, textDecoration = TextDecoration.Underline, fontWeight = FontWeight.Bold)
        }
        // Top-left corner (Red)
        LudoCorner(
            color = Color.Red,
            modifier = Modifier
                .size(110.dp)
                .padding(5.dp)
                .clip(RoundedCornerShape(6.dp))
                .align(Alignment.TopStart)
        )

        // Top-right corner (Green)
        LudoCorner(
            color = Color.Green,
            modifier = Modifier
                .size(110.dp)
                .padding(5.dp)
                .clip(RoundedCornerShape(6.dp))
                .align(Alignment.TopEnd)
        )

        // Bottom-left corner (Yellow)
        LudoCorner(
            color = Color.Yellow,
            modifier = Modifier
                .size(110.dp)
                .padding(5.dp)
                .clip(RoundedCornerShape(6.dp))
                .align(Alignment.BottomStart)
        )

        // Bottom-right corner (Blue)
        LudoCorner(
            color = Color.Blue,
            modifier = Modifier
                .size(110.dp)
                .padding(5.dp)
                .clip(RoundedCornerShape(6.dp))
                .align(Alignment.BottomEnd)
        )
    }
}

@Composable
fun LudoCorner(color: Color, modifier: Modifier = Modifier) {
    // Outer box for a Ludo corner
    Box(
        modifier = modifier
            .background(color)
    ) {
        // Inner 2x2 discs (smaller boxes) inside the corner
        Disc("1", Modifier.offset(10.dp, 10.dp))
        Disc("2", Modifier.offset(60.dp, 10.dp))
        Disc("3", Modifier.offset(10.dp, 60.dp))
        Disc("4", Modifier.offset(60.dp, 60.dp))
    }
}

@Composable
fun Disc(number: String, modifier: Modifier = Modifier) {
    // Small circular disc in the Ludo corner
    Box(
        modifier = modifier
            .size(30.dp)
            .background(Color.White, shape = CircleShape), // White disc with circle shape
        contentAlignment = Alignment.Center
    ) {
        Text(text = number, color = Color.Black, textAlign = TextAlign.Center)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLudoBoardWithCorners() {
    LudoBoardWithCorners()
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ComposePlaylistTheme {
        Greeting("Android")
    }
}

