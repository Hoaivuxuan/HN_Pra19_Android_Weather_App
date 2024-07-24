package com.example.android_template.data.repository.source

import com.example.android_template.data.model.CurrentWeather
import com.example.android_template.data.repository.source.remote.OnResultListener

interface CurrentWeatherDataSource {

    interface Local {
        fun getCurrentWeatherLocal(listener: OnResultListener<CurrentWeather>)
    }

    interface Remote {
        fun getCurrentWeather(listener: OnResultListener<CurrentWeather>)
    }
}
