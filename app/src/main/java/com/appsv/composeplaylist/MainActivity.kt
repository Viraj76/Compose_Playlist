package com.appsv.composeplaylist

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.sharp.Close
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ChipColors
import androidx.compose.material3.ChipElevation
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import androidx.core.content.edit
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

@Composable
fun GreetingPreview() {
    ComposePlaylistTheme {
        Greeting("Android")
    }
}

@Composable
fun ComposableBox() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            modifier = Modifier
                .size(300.dp)
                .padding(20.dp)
                .clip(RoundedCornerShape(30.dp))
                .background(Color.DarkGray),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(30.dp))
                    .background(Color.LightGray),
            )
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(30.dp))
                    .background(Color.Red)
                    .align(Alignment.TopStart),
            )
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(30.dp))
                    .background(Color.Yellow)
                    .align(Alignment.TopEnd),
            )
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(30.dp))
                    .background(Color.Blue)
                    .align(Alignment.BottomStart),
            )
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(30.dp))
                    .background(Color.Green)
                    .align(Alignment.BottomEnd),
            )
        }
    }
}

@Composable
fun ComposableSurface(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(200.dp)
            .shadow(
                elevation = 10.dp,
                spotColor = Color.Red,
                shape = RoundedCornerShape(15.dp)
            ),
        color = Color.White,
        shadowElevation = 10.dp,
        shape = RoundedCornerShape(15.dp),
        border = BorderStroke(1.dp, Color.Red)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Subscribe",
                style = TextStyle(
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    shadow = Shadow(
                        color = Color.Red,
                        blurRadius = 20f
                    )
                )
            )
        }
    }
}

@Composable
fun CounterScreen(modifier: Modifier = Modifier) {
    var count by rememberSaveable {
        mutableIntStateOf(0)
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Text(
                text = "Counter App",
                style = TextStyle(
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    shadow = Shadow(
                        color = Color.Blue,
                        blurRadius = 20f
                    )
                )
            )
            Spacer(modifier = Modifier.height(50.dp))
            Text(
                text = count.toString(),
                style = TextStyle(
                    fontSize = 70.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    shadow = Shadow(
                        color = Color.Cyan,
                        blurRadius = 20f
                    )
                )
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    // button clicked
                    count++

                },

                shape = RoundedCornerShape(topEnd = 10.dp, bottomStart = 10.dp),
                colors = ButtonDefaults.buttonColors().copy(
                    containerColor = Color.Blue,
                    contentColor = Color.Green,
                ),
                border = BorderStroke(
                    3.dp,
                    Brush.horizontalGradient(listOf(Color.Magenta, Color.Green, Color.Yellow))
                ),
                contentPadding = PaddingValues(
                    start = 45.dp,
                    end = 45.dp,
                    top = 15.dp,
                    bottom = 15.dp
                )
            ) {
                Text(text = "Count", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Log.d("PCoders", "B1")
            }


        }
    }
}

@Composable
fun ComposableImage(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(20.dp)
            .shadow(20.dp, shape = RoundedCornerShape(20.dp), spotColor = Color.Yellow)
    ) {
        Image(
            painter = painterResource(id = R.drawable.papaya_coders),
            contentDescription = "Papaya Coders",
            contentScale = ContentScale.Fit,
            alignment = Alignment.Center,
            alpha = 1f,
        )
    }

}


@Composable
fun ComposableIcons(modifier: Modifier = Modifier) {

    IconButton(
        onClick = { /*TODO*/ },
        colors = IconButtonDefaults.iconButtonColors().copy(
            containerColor = Color.Blue
        )
    ) {
        Icon(
            imageVector = Icons.Sharp.Close,
            contentDescription = "Icon",
            tint = Color.Green,

            )
    }

}


@Composable
fun ComposableTextField(modifier: Modifier = Modifier) {

    var tfText by remember {
        mutableStateOf("")
    }

    var passwordVisible by remember {
        mutableStateOf(false)
    }

    TextField(
        value = tfText,
        onValueChange = { text ->
            tfText = text
        },
        modifier = Modifier.padding(30.dp),
        label = {
            Text(text = "Email")
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Email Icon"
            )
        },
        trailingIcon = {
            IconButton(onClick = {
                passwordVisible = !passwordVisible
            }) {
                Icon(
                    imageVector = Icons.Default.Done,
                    tint = Color.Blue,
                    contentDescription = "Email Icon"
                )
            }

        },

        visualTransformation = if (!passwordVisible) PasswordVisualTransformation() else VisualTransformation.None,
        keyboardOptions = KeyboardOptions(
            KeyboardCapitalization.Words,
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Search
        ),
        keyboardActions = KeyboardActions(
            onSearch = {
                Log.d("OnSearch", "OnSearch")
            }
        ),
        colors = TextFieldDefaults.colors().copy(
            focusedTextColor = Color.Blue,
            unfocusedTextColor = Color.Blue,
            focusedContainerColor = Color.Cyan,
            unfocusedContainerColor = Color.Cyan,
            focusedLabelColor = Color.Blue,
            unfocusedLabelColor = Color.Blue,
            focusedPlaceholderColor = Color.Blue,
            unfocusedPlaceholderColor = Color.Blue,
            focusedTrailingIconColor = Color.Blue,
            unfocusedTrailingIconColor = Color.Blue,
            focusedLeadingIconColor = Color.Blue,
            unfocusedLeadingIconColor = Color.Blue,
            focusedIndicatorColor = Color.Blue,
            unfocusedIndicatorColor = Color.Blue,
            cursorColor = Color.Blue
        )
    )
}


@Composable
fun ComposableChips(modifier: Modifier = Modifier) {

    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        var selectedChip by remember {
            mutableStateOf("All")
        }
        FilterChip(
            onClick = {
                selectedChip = "All"
            },
            selected = selectedChip == "All",
            label = { Text(text = "All") },
            leadingIcon = {
                if (selectedChip == "All") {
                    Icon(imageVector = Icons.Default.Done, contentDescription = "Settings")
                }
            },
            border = null,
            colors = FilterChipDefaults.filterChipColors().copy(
                containerColor = Color.Cyan.copy(0.5f),
                labelColor = Color.White,
                leadingIconColor = Color.White
            )
        )
        SuggestionChip(onClick = { /*TODO*/ }, label = { /*TODO*/ })
        FilterChip(
            onClick = {
                selectedChip = "Low"
            },
            selected = selectedChip == "Low",
            label = { Text(text = "Low") },
            leadingIcon = {
                if (selectedChip == "Low") {
                    Icon(imageVector = Icons.Default.Done, contentDescription = "Settings")
                }
            },
            border = null,
            colors = FilterChipDefaults.filterChipColors().copy(
                containerColor = Color.Green.copy(0.5f),
                labelColor = Color.Green,
                leadingIconColor = Color.Green,
                selectedContainerColor = Color.Green.copy(0.5f),
                selectedLabelColor = Color.Green,
                selectedLeadingIconColor = Color.Green,

                )
        )
        FilterChip(
            onClick = {
                selectedChip = "Medium"
            },
            selected = selectedChip == "Medium",
            label = { Text(text = "Medium") },
            leadingIcon = {
                if (selectedChip == "Medium") {
                    Icon(imageVector = Icons.Default.Done, contentDescription = "Settings")
                }
            },
            border = null,
            colors = FilterChipDefaults.filterChipColors().copy(
                containerColor = Color.Yellow.copy(0.5f),
                labelColor = Color.Yellow,
                leadingIconColor = Color.Yellow
            )
        )
        FilterChip(
            onClick = { selectedChip = "Hard" },
            selected = selectedChip == "Hard",
            label = { Text(text = "Hard") },
            leadingIcon = {
                if (selectedChip == "Hard") {
                    Icon(imageVector = Icons.Default.Done, contentDescription = "Settings")
                }
            },
            border = null,
            colors = FilterChipDefaults.filterChipColors().copy(
                containerColor = Color.Red.copy(0.5f),
                labelColor = Color.Red,
                leadingIconColor = Color.Red
            )
        )
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ComposableLazy(modifier: Modifier = Modifier) {
    LazyColumn(
        contentPadding = PaddingValues(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(cricketPlayersList) { it ->
            val name = it.name
            val color = it.color
            CricketersItem(name = name, color = color)
        }
    }
}

data class Cricketer(
    val name: String,
    val color: Color
)

val cricketPlayersList = listOf(

    Cricketer("Virat", Color.Blue),
    Cricketer("Rohit", Color.Green),
    Cricketer("Surya", Color.Black),
    Cricketer("Rishabh", Color.Magenta),
    Cricketer("Pandya", Color.Red),
    Cricketer("Jaddu", Color.DarkGray),
    Cricketer("Kuldeep", Color.Black),
    Cricketer("Chahal", Color.Blue),
    Cricketer("Bumrah", Color.Green),
    Cricketer("Siraj", Color.Yellow),
    Cricketer("Shami", Color.Magenta),
    Cricketer("Shami", Color.Magenta),
    Cricketer("Shami", Color.Magenta),
    Cricketer("Shami", Color.Magenta),
)


@Composable
fun CricketersItem(
    modifier: Modifier = Modifier,
    name : String = "Virat",
    color : Color = Color.Blue
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(
                elevation = 10.dp,
                spotColor = color,
                shape = RoundedCornerShape(15.dp)
            ),
        color = Color.White,
        shadowElevation = 10.dp,
        shape = RoundedCornerShape(15.dp),
        border = BorderStroke(1.dp, color)
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically
        ){
            Spacer(modifier = Modifier.width(20.dp))
            Icon(
                modifier = Modifier
                    .size(45.dp)
                    .clip(RoundedCornerShape(25.dp))
                    .background(color),
                imageVector = Icons.Default.Person,
                contentDescription = "Person",
                tint = Color.White
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(
                modifier =  Modifier.padding(10.dp),
                text = name,
                style = TextStyle(
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    shadow = Shadow(
                        color = color,
                        blurRadius = 20f
                    )
                )
            )
        }


    }
}


