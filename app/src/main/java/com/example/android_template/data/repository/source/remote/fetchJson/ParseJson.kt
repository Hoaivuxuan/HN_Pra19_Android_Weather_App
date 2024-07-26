package com.example.android_template.data.repository.source.remote.fetchJson

import com.example.android_template.data.model.CurrentWeather
import com.example.android_template.utils.CurrentWeatherEntry
import org.json.JSONObject

class ParseJson {

    fun currentWeatherParseJson(jsonObject: JSONObject) = CurrentWeather().apply{
        jsonObject.let{
             currentTemperature = it.getDouble(CurrentWeatherEntry.CURRENT_TEMPERATURE)
             weatherStatus= it.getString(CurrentWeatherEntry.WEATHER_STATUS)
             iconWeather= it.getString(CurrentWeatherEntry.ICON_WEATHER)
             windSpeed = it.getDouble(CurrentWeatherEntry.WIND_SPEED)
             humidity = it.getInt(CurrentWeatherEntry.HUMIDITY)
             percentCloud = it.getInt(CurrentWeatherEntry.PERCENT_CLOUD)
        }
    }
}
