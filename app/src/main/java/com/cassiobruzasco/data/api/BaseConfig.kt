package com.cassiobruzasco.data.api

/**
 * This is a constant class to provide base url, api key, and more
 * Things that won't change in the future
 */
class BaseConfig {
    companion object {
        const val BASE_URL = "https://api.openweathermap.org/data/2.5/forecast/"
        const val API_KEY = "648a3aac37935e5b45e09727df728ac2"
        const val UNITS = "metric"
        const val MODE = "json"
        const val HEADER_CACHE = "android-cache"
    }

    object CacheTimeout {
        const val DEFAULT = 1 * 60 * 60L
        const val NONE = 0L
    }
}