package com.example.sun.data.repository.source.remote.fetchJson

import com.example.sun.data.model.CurrentWeather
import com.example.sun.utils.CurrentWeatherEntry
import org.json.JSONObject

class ParseJson {

    fun currentWeatherParseJson(jsonObject: JSONObject) = CurrentWeather().apply {
        jsonObject.let {
            currentTemperature = it.getDouble(CurrentWeatherEntry.CURRENT_TEMPERATURE)
            weatherStatus = it.getString(CurrentWeatherEntry.WEATHER_STATUS)
            iconWeather = it.getString(CurrentWeatherEntry.ICON_WEATHER)
            windSpeed = it.getDouble(CurrentWeatherEntry.WIND_SPEED)
            humidity = it.getInt(CurrentWeatherEntry.HUMIDITY)
            percentCloud = it.getInt(CurrentWeatherEntry.PERCENT_CLOUD)
        }
    }
}
