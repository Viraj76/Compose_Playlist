package com.appsv.composeplaylist.ignore

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random


@Composable
fun ComposableSideEffects(modifier: Modifier = Modifier) {

    var count by remember { mutableIntStateOf(0) }

    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        Column {

            Button(onClick = {
                count++
            }) {
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
        Log.d("TAG", "Resource Occupied")

        onDispose {
            Log.d("TAG", "Resource Released")
        }
    }
    Button(onClick = { clicked = !clicked }) {
        Text(("Click"))
    }

}


@Composable
fun ComposableSideEffect(modifier: Modifier = Modifier) {
    var count by remember { mutableIntStateOf(0) }

    SideEffect {
        Log.d("TAG", "Count $count")
    }

    Column {
        Button(onClick = { count++ }) {
            Text(("Click $count"))
        }

        Text("Count $count")
    }

}


@Composable
fun ComposableRememberScope(modifier: Modifier = Modifier) {

    val scope = rememberCoroutineScope()


    var buttonText by remember { mutableStateOf("Hello") }
    Button(onClick = {
        scope.launch {
            delay(2000)
            buttonText = "World"
        }
    }) {
        Text(buttonText)
    }
}

@Composable
fun ComposableRememberUpdatedState(modifier: Modifier = Modifier) {
    var count by remember { mutableIntStateOf(0) }

    Button(onClick = {
        count = Random.nextInt(1, 100)
        Log.d("PapayaCoders", "Random Count $count")
    }) {
        Text("Click")
    }

    ShowUpdatedValue(count)
}



@Composable
fun ComposableProduceState(modifier: Modifier = Modifier) {
//    var initialState by remember { mutableStateOf("Loading..") }
//    LaunchedEffect(key1 = Unit) {
//        val data = getData()
//        initialState = if (data.isNotEmpty()) "Data Fetched"
//        else "Data did not fetched"
//    }
    var count by remember { mutableIntStateOf(0) }
    
    val dataFetched by produceState("", key1 = count) {
        Log.d("TAG", "Getting Data")
        val data = getData()
        value = if(data.isNotEmpty()) "Data Fetched"
        else "Data did not fetched"
        Log.d("TAG", "Got Data")

    }

    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = {
                count++
            }
        ) { }
        if (dataFetched == "Loading..") {
            CircularProgressIndicator()
        } else {
            Text(dataFetched)
        }
    }


}

@Preview
@Composable
fun ComposableDerivedStateOf(modifier: Modifier = Modifier) {

    var count by remember { mutableIntStateOf(0) }

    val derivedCount by remember {
        derivedStateOf {
            count > 3
        }
    }

    Column {
        Button(
            onClick = {
                count++
            }
        ) {
            Text("Button1")
        }

        if(derivedCount){
            Log.d("TAG", "Showing Button")
            Button(
                onClick = {

                }
            ) {
                Text("Button2")
            }
        }
        else{
            Log.d("TAG", "Hiding Button")
        }
    }

}


@Composable
fun ShowUpdatedValue(count: Int) {
    val updatedCount = rememberUpdatedState(count)
    LaunchedEffect(key1 = Unit) {
        delay(10000)
        Log.d("PapayaCoders", "Updated Count ${updatedCount.value}")
    }
}

// network call
suspend fun getData(): List<String> {
    delay(4000)
    return listOf("Papaya", "Coders")
}


