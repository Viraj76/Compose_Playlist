package com.appsv.composeplaylist

import android.content.Context
import android.graphics.Paint.Align
import android.hardware.camera2.CameraManager
import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.LifecycleOwner
import kotlinx.coroutines.delay


@Composable
fun ComposableSideEffects(modifier: Modifier = Modifier) {

    var count by remember { mutableIntStateOf(0) }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column {

            Button(
                onClick = {
                    count++
                }
            ) {
                Text("Increment $count")
            }

           LaunchedEffect(
               key1 = count,
           ) {
               delay(2000)
               val data = getData()
               Log.d("Papaya Coders", "$data $count")
           }
        }

    }

}


@Composable
fun ComposableDisposableEffect(modifier: Modifier = Modifier) {

    var clicked by remember { mutableStateOf(false) }

    DisposableEffect(key1 = clicked) {
        Log.d("TAG" , "Resource Occupied")

        onDispose {
            Log.d("TAG" , "Resource Released")
        }
    }
    Button(
        onClick = {clicked = !clicked}
    ) {
        Text(("Click"))
    }

}

@Preview(showBackground = true)
@Composable
fun ComposableSideEffect(modifier: Modifier = Modifier) {
    var count by remember { mutableIntStateOf(0) }

    SideEffect {
        Log.d("TAG" , "Count $count")
    }

   Column {
       Button(
           onClick = {count++}
       ) {
           Text(("Click $count"))
       }

       Text("Count $count")
   }

}
// network call
fun getData() : List<String> {

    return listOf("Papaya" , "Coders")
}


