package com.appsv.composeplaylist.domain.model.weather

import com.appsv.composeplaylist.data.dto.weather.Clouds
import com.appsv.composeplaylist.data.dto.weather.Main
import com.appsv.composeplaylist.data.dto.weather.Rain
import com.appsv.composeplaylist.data.dto.weather.Sys
import com.appsv.composeplaylist.data.dto.weather.Weather
import com.appsv.composeplaylist.data.dto.weather.Wind

data class WeatherUI(
    val location: String,
    val base: String,
    val clouds: Clouds,
    val cod: Int,
    val dt: Int,
    val id: Int,
    val main: Main,
    val name: String,
    val rain: Rain,
    val sys: Sys,
    val timezone: Int,
    val visibility: Int,
    val weather: List<Weather>,
    val wind: Wind
)
