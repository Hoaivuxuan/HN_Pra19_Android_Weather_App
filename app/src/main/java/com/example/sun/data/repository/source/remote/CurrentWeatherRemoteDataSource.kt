package com.example.sun.data.repository.source.remote

import com.example.sun.data.model.CurrentWeather
import com.example.sun.data.repository.source.CurrentWeatherDataSource
import com.example.sun.data.repository.source.remote.fetchJson.GetJsonFromUrl
import com.example.sun.data.repository.source.remote.fetchJson.ParseDataWithJson
import com.example.sun.utils.Constant
import com.example.sun.utils.CurrentWeatherEntry
import org.json.JSONObject

class CurrentWeatherRemoteDataSource : CurrentWeatherDataSource.Remote {
    override fun getCurrentWeather(listener: OnResultListener<MutableList<CurrentWeather>>) {
        GetJsonFromUrl.getInstance(
            urlString = Constant.BASE_URL + Constant.BASE_SEARCH_CURRENT_WEATHER,
            keyEntity = CurrentWeatherEntry.CURRENT_WEATHER,
            listener = listener,
            getDataFromJson = { response, keyEntity ->
                ParseDataWithJson().parseJsonToData(JSONObject(response), keyEntity)
            }
        )
    }

    companion object {
        private var instant: CurrentWeatherRemoteDataSource? = null

        fun getInstance() = synchronized(this) {
            instant ?: CurrentWeatherRemoteDataSource().also { instant = it }
        }
    }
}
