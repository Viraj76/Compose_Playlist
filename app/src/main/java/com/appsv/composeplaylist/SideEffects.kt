package com.appsv.composeplaylist

import android.graphics.Paint.Align
import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay

@Preview(showBackground = true)
@Composable
fun ComposableSideEffect(modifier: Modifier = Modifier) {

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

// network call
fun getData() : List<String> {
    return listOf("Papaya" , "Coders")
}