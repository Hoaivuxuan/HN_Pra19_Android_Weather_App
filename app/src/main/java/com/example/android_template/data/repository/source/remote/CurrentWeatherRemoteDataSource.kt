package com.example.android_template.data.repository.source.remote

import com.example.android_template.data.model.CurrentWeather
import com.example.android_template.data.repository.source.CurrentWeatherDataSource
import com.example.android_template.data.repository.source.remote.fetchJson.GetJsonFromUrl
import com.example.android_template.utils.Constant
import com.example.android_template.utils.CurrentWeatherEntry

class CurrentWeatherRemoteDataSource : CurrentWeatherDataSource.Remote {
    override fun getCurrentWeather(listener: OnResultListener<CurrentWeather>) {
        GetJsonFromUrl(
            urlString = Constant.BASE_URL + Constant.BASE_SEARCH_CURRENT_WEATHER,
            keyEntity = CurrentWeatherEntry.CURRENT_WEATHER,
            listener
        )
    }

    companion object {
        private var instant: CurrentWeatherRemoteDataSource? = null

        fun getInstance() = synchronized(this) {
            instant ?: CurrentWeatherRemoteDataSource().also { instant = it }
        }
    }
}
