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
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow

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
fun Greeting(name: String, modifier: Modifier = Modifier) {

//    Text(
//        text = "Hello $name!",
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(10.dp),
//        color = Color.Blue,
//        fontSize = 20.sp,
//        fontStyle = FontStyle.Normal,
//        fontWeight = FontWeight.Bold,
//        textDecoration = TextDecoration.Underline,
//        maxLines = 2,
//        overflow = TextOverflow.Ellipsis
//
//    )

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(
            onClick = {
                // button clicked
            },

            shape = RoundedCornerShape(topEnd = 10.dp, bottomStart = 10.dp),
            colors = ButtonDefaults.buttonColors().copy(
                containerColor = Color.Blue,
                contentColor = Color.Green,
            ),
            border = BorderStroke(
                1.dp,
                Brush.horizontalGradient(listOf(Color.Magenta, Color.Green, Color.Yellow))
            ),
            contentPadding = PaddingValues(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Button1")
        }
        Button(
            onClick = {
                // button clicked
            },

            shape = RoundedCornerShape(topEnd = 10.dp, bottomStart = 10.dp),
            colors = ButtonDefaults.buttonColors().copy(
                containerColor = Color.Blue,
                contentColor = Color.Green,
            ),
            border = BorderStroke(
                1.dp,
                Brush.horizontalGradient(listOf(Color.Magenta, Color.Green, Color.Yellow))
            ),
            contentPadding = PaddingValues(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Button2")
        }
        Button(
            onClick = {
                // button clicked
            },

            shape = RoundedCornerShape(topEnd = 10.dp, bottomStart = 10.dp),
            colors = ButtonDefaults.buttonColors().copy(
                containerColor = Color.Blue,
                contentColor = Color.Green,
            ),
            border = BorderStroke(
                1.dp,
                Brush.horizontalGradient(listOf(Color.Magenta, Color.Green, Color.Yellow))
            ),
            contentPadding = PaddingValues(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Button3")
        }
    }



}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun BoxSurfaceCard() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        propagateMinConstraints = false,
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(250.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(90.dp)
                    .padding(5.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(Color.Green)
                    .align(Alignment.TopStart)

            ){
                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .padding(5.dp)
                        .alpha(0.2f)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.Black)

                        .align(Alignment.TopStart)
                )
                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .padding(5.dp)
                        .alpha(0.2f)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.Black)
                        .align(Alignment.TopEnd)
                )
                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .padding(5.dp)
                        .alpha(0.2f)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.Black)
                        .align(Alignment.BottomStart)
                )
                Box(
                        modifier = Modifier
                            .size(30.dp)
                            .padding(5.dp)
                            .alpha(0.2f)
                            .clip(RoundedCornerShape(15.dp))
                            .background(Color.Black)
                            .align(Alignment.BottomEnd)
                        )

            }
            Box(
                modifier = Modifier
                    .size(107.dp)
                    .padding(5.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(Color.Gray)
            )
            Box(
                modifier = Modifier
                    .size(90.dp)
                    .padding(5.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(Color.Yellow)
                    .align(Alignment.TopEnd)
            ){
                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .padding(5.dp)
                        .alpha(0.2f)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.Black)

                        .align(Alignment.TopStart)
                )
                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .padding(5.dp)
                        .alpha(0.2f)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.Black)
                        .align(Alignment.TopEnd)
                )
                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .padding(5.dp)
                        .alpha(0.2f)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.Black)
                        .align(Alignment.BottomStart)
                )
                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .padding(5.dp)
                        .alpha(0.2f)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.Black)
                        .align(Alignment.BottomEnd)
                )
            }
            Box(
                modifier = Modifier
                    .size(90.dp)
                    .padding(5.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(Color.Cyan)
                    .align(Alignment.BottomStart)
            ){
                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .padding(5.dp)
                        .alpha(0.2f)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.Black)

                        .align(Alignment.TopStart)
                )
                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .padding(5.dp)
                        .alpha(0.2f)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.Black)
                        .align(Alignment.TopEnd)
                )
                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .padding(5.dp)
                        .alpha(0.2f)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.Black)
                        .align(Alignment.BottomStart)
                )
                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .padding(5.dp)
                        .alpha(0.2f)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.Black)
                        .align(Alignment.BottomEnd)
                )
            }
            Box(
                modifier = Modifier
                    .size(90.dp)
                    .padding(5.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(Color.Red)
                    .align(Alignment.BottomEnd)
            ){
                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .padding(5.dp)
                        .alpha(0.2f)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.Black)

                        .align(Alignment.TopStart)
                )
                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .padding(5.dp)
                        .alpha(0.2f)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.Black)
                        .align(Alignment.TopEnd)
                )
                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .padding(5.dp)
                        .alpha(0.2f)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.Black)
                        .align(Alignment.BottomStart)
                )
                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .padding(5.dp)
                        .alpha(0.2f)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.Black)
                        .align(Alignment.BottomEnd)
                )
            }

        }
    }
}

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun GreetingPreview() {
//    ComposePlaylistTheme {
//        Greeting("Android")
//    }
//}

