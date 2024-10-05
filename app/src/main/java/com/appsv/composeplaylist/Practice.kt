package com.appsv.composeplaylist

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun Practice() {

    val count = remember { mutableStateOf(0) }


    // Called on every recomposition
    Log.d("ComposePlaylist", "Count is ${count.value}")


    Column {
        Button(onClick = { count.value++ }) {
            Text("Increase Count ${count.value}")
            Log.d("Composeplaylist", "Recomposed 1")

        }
        Button(onClick = {  }) {
            Text("Increase Count")
            Log.d("Composeplaylist", "Recomposed 2")


        }
    }
}

@Composable
fun Screen() {

    val count by remember { mutableIntStateOf(0) }

    @Composable
    fun FirstComposabl(modifier: Modifier = Modifier) {

    }

}