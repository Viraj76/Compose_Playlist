package com.appsv.composeplaylist.data.mapper

import com.appsv.composeplaylist.core.util.getPlaceFromCord
import com.appsv.composeplaylist.data.dto.weather.WeatherDTO
import com.appsv.composeplaylist.domain.model.weather.WeatherUI


fun WeatherDTO.toWeatherUI() : WeatherUI{
    return WeatherUI(
        location = getPlaceFromCord(coord.lon, coord.lat),
        base = base,
        clouds = clouds,
        cod = cod,
        dt = dt,
        id = id,
        main = main,
        name = name,
        rain = rain,
        sys = sys,
        timezone = timezone,
        visibility = visibility,
        weather = weather,
        wind = wind
    )
}