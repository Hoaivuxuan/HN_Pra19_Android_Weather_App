package com.example.android_template.data.repository

import com.example.android_template.data.model.CurrentWeather
import com.example.android_template.data.repository.source.CurrentWeatherDataSource
import com.example.android_template.data.repository.source.remote.OnResultListener

class CurrentWeatherRepository(
    private val remote: CurrentWeatherDataSource.Remote,
    private val local: CurrentWeatherDataSource.Local
) : CurrentWeatherDataSource.Local, CurrentWeatherDataSource.Remote {
    override fun getCurrentWeatherLocal(listener: OnResultListener<CurrentWeather>) {
        TODO("Not yet implemented")
    }

    override fun getCurrentWeather(listener: OnResultListener<CurrentWeather>) {
        remote.getCurrentWeather(listener)
    }

    companion object {
        private var instant: CurrentWeatherRepository? = null

        fun getInstance(
            remote: CurrentWeatherDataSource.Remote,
            local: CurrentWeatherDataSource.Local
        ) = synchronized(this) {
            instant ?: CurrentWeatherRepository(remote, local).also { instant = it }
        }
    }
}
