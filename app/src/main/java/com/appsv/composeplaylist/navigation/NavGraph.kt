package com.appsv.composeplaylist.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.appsv.composeplaylist.FirstScreen
import com.appsv.composeplaylist.SecondScreen

@Composable
fun SetUpNavGraph(modifier: Modifier = Modifier) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = FirstScreen){

        composable<FirstScreen> {
            FirstScreen(){
                navController.navigate(SecondScreen(
                    name = "Virat",
                    age = 37
                ))
            }
        }

        composable<SecondScreen> {
            val args = it.toRoute<SecondScreen>()
            LaunchedEffect(Unit) {
                Log.d("TAG", "${args.name}  ${args.age}")
            }
            SecondScreen(){
                navController.navigate(FirstScreen){
                    popUpTo<FirstScreen> { inclusive = true }
                }
            }
        }

    }

    /*



     */


}