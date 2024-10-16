package com.appsv.composeplaylist.navigation

import kotlinx.serialization.Serializable


@Serializable
object FirstScreen

@Serializable
data class SecondScreen(
    val name : String,
    val age : Int
)