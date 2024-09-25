package com.appsv.composeplaylist

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.sharp.Close
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.material3.rememberDrawerState
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.appsv.composeplaylist.ui.theme.ComposePlaylistTheme
import kotlinx.coroutines.launch


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

@Composable
fun ComposableLazy(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier,
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
    name: String = "Virat",
    color: Color = Color.Blue
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
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
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
                modifier = Modifier.padding(10.dp),
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


@Composable
fun ComposableCheckBoxes(modifier: Modifier = Modifier) {

    var checked by remember {
        mutableStateOf(false)
    }

    Checkbox(
        checked = checked,
        onCheckedChange = {
            checked = !checked
        },
        colors = CheckboxDefaults.colors().copy(
            checkedBoxColor = Color.Blue,
            uncheckedBoxColor = Color.Blue,
            checkedBorderColor = Color.Green,
            uncheckedBorderColor = Color.Green,
            checkedCheckmarkColor = Color.Green,
            uncheckedCheckmarkColor = Color.Green,
        )
    )
}


@Composable
fun CheckboxParentExample() {
    // Initialize states for the child checkboxes
    val childCheckedStates = remember { mutableStateListOf(false, false, false) }

    // Compute the parent state based on children's states
    val parentState = when {

        childCheckedStates.all { it } -> ToggleableState.On

        childCheckedStates.none { it } -> ToggleableState.Off

        else -> ToggleableState.Indeterminate
    }

    Column {

        // Parent TriStateCheckbox
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text("Select all")

            TriStateCheckbox(
                state = parentState,
                onClick = {

                    // Determine new state based on current state
                    val newState = parentState != ToggleableState.On

                    childCheckedStates.forEachIndexed { index, _ ->
                        childCheckedStates[index] = newState
                    }

                }
            )
        }

        // Child Checkboxes
        childCheckedStates.forEachIndexed { index, checked ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text("Option ${index + 1}")
                Checkbox(
                    checked = checked,
                    onCheckedChange = { isChecked ->
                        // Update the individual child state
                        childCheckedStates[index] = isChecked
                    }
                )
            }
        }
    }

    if (childCheckedStates.all { it }) {
        Text("All options selected")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComposableTopAppbar(scrollBehavior: TopAppBarScrollBehavior, drawerState: DrawerState) {
    val scope = rememberCoroutineScope()
    LargeTopAppBar(
        title = {
            Text(
                text = "Home",
            )
        },
        navigationIcon = {
            IconButton(onClick = {

                    scope.launch {
                        drawerState.apply {
                        if(isOpen) close() else open()
                    }
                }
            }) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "Home")
            }
        },
        actions = {
            Icon(imageVector = Icons.Default.Settings, contentDescription = "Home")
            Spacer(modifier = Modifier.width(20.dp))
            Icon(imageVector = Icons.Default.Info, contentDescription = "Home")
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,

            ),
        scrollBehavior = scrollBehavior
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComposableBottomApp(modifier: Modifier = Modifier) {


    BottomAppBar(
        contentPadding = PaddingValues(start = 20.dp)
    ) {
        Icon(imageVector = Icons.Default.Edit, contentDescription = "")
        Spacer(modifier = Modifier.width(20.dp))
        Icon(imageVector = Icons.Default.Done, contentDescription = "")
        Spacer(modifier = Modifier.width(20.dp))
        Icon(imageVector = Icons.Default.Build, contentDescription = "")
    }

}

@OptIn(ExperimentalMaterial3Api::class)


@Composable
fun ComposableScaffold(drawerState: DrawerState) {
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(rememberTopAppBarState())
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            ComposableTopAppbar(scrollBehavior,drawerState)
        },
        bottomBar = {
            ComposableBottomApp()
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "")
            }
        },
        floatingActionButtonPosition = FabPosition.End
    ) { innerPadding ->
        ComposableLazy(modifier = Modifier.padding(innerPadding))
    }
}

@Composable
fun ComposableFAB(modifier: Modifier = Modifier) {
   Box(
       modifier = Modifier.fillMaxSize()
   ) {
       Dialog(onDismissRequest = { /*TODO*/ }) {
           
       }

       FloatingActionButton(
           modifier = Modifier
               .padding(20.dp)
               .align(Alignment.BottomEnd),
           onClick = { /*TODO*/ },
       ) {
           ModalNavigationDrawer(drawerContent = { /*TODO*/ }) {
               
           }
           Icon(imageVector = Icons.Default.Add, contentDescription = "")
       }
   }
}

@Composable
fun ComposableNavigationDrawer(modifier: Modifier = Modifier) {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet(
                modifier = Modifier.width(200.dp)
            ) {
                Text(
                    modifier = Modifier.padding(30.dp),
                    text = "Compose Playlist",
                    fontSize = 26.sp
                )
                HorizontalDivider()
                Spacer(modifier = Modifier.height(20.dp))
                NavigationDrawerItem(
                    label = { 
                        Text(text = "Inbox")
                    },
                    selected = true ,
                    onClick = {  },
                    icon = {
                        Icon(imageVector = Icons.Default.Email, contentDescription = "")
                    },
                    badge = {
                        Icon(imageVector = Icons.Default.Check, contentDescription = "")
                    }
                )
                NavigationDrawerItem(
                    label = {
                        Text(text = "Outbox")
                    },
                    selected = false ,
                    onClick = {  },
                    icon = {
                        Icon(imageVector = Icons.Default.Send, contentDescription = "")
                    }
                )
                NavigationDrawerItem(
                    label = {
                        Text(text = "Favorites")
                    },
                    selected = false ,
                    onClick = {  },
                    icon = {
                        Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "")
                    }
                )

            }
        },
        drawerState = drawerState
    ) {
        ComposableScaffold(drawerState)

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ComposableDialog(modifier: Modifier = Modifier) {

    var showDialog by remember {
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Button(onClick = {
            showDialog = true
        }) {
            Text(text = "Show Dialog")
        }
    }

//    if(showDialog){
//        AlertDialog(
//            onDismissRequest = {
//                showDialog = false
//            },
//            confirmButton = {
//                Button(onClick = {
//                    showDialog = false
//                }) {
//                    Text(text = "Confirm")
//                }
//            },
//            icon = {
//                Icon(imageVector = Icons.Default.Build, contentDescription = "")
//            },
//            title = {
//                Text(text = "Alert dialog")
//            },
//            text = {
//                Text(text = "This is an alert dialog")
//            },
//            dismissButton = {
//                Button(onClick = {
//                    showDialog = false
//                }) {
//                    Text(text = "Cancel")
//                }
//            }
//
//        )
//    }

    if(showDialog){
        Dialog(onDismissRequest = {
            showDialog = false
        }) {
            ComposableTextField()
        }
    }


}



