package com.example.android_template.data.repository.source.local

import com.example.android_template.data.model.CurrentWeather
import com.example.android_template.data.repository.source.CurrentWeatherDataSource
import com.example.android_template.data.repository.source.remote.OnResultListener

class CurrentWeatherLocalDataSource : CurrentWeatherDataSource.Local {
    override fun getCurrentWeatherLocal(listener: OnResultListener<CurrentWeather>) {
        TODO("Not yet implemented")
    }

    companion object {
        private var instance: CurrentWeatherLocalDataSource? = null

        fun getInstance() = synchronized(this) {
            instance ?: CurrentWeatherLocalDataSource().also { instance = it }
        }
    }
}
