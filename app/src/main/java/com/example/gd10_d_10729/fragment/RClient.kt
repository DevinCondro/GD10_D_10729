package com.example.gd10_d_10729.fragment

import okhttp3.OkHttp
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



object RClient {


    private const val BASE_URL = "http://10.53.15.229/ci4-apiserver/public/"
    val instances: api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(api::class.java)
    }
}