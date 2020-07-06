package com.example.hiltarchitech.di

import com.example.hiltarchitech.network.ApiService
import com.example.hiltarchitech.utility.NetworkUtil
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by Rahul on 01/07/20.
 */

@InstallIn(ApplicationComponent::class)

@Module
object NetworkModule {

    @Provides
    fun provideBaseUrl(): String {

        return NetworkUtil.BASE_URL
    }

    @Provides
    fun provideLoggingInterceptor(): HttpLoggingInterceptor {

        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    @Provides
    fun provideOkHttpBuilder(logger: HttpLoggingInterceptor): OkHttpClient {
        val okHttpBuilder = OkHttpClient.Builder()
        okHttpBuilder.addInterceptor(logger)
        okHttpBuilder.callTimeout(60, TimeUnit.SECONDS)
        okHttpBuilder.connectTimeout(60, TimeUnit.SECONDS)
        okHttpBuilder.writeTimeout(60, TimeUnit.SECONDS)
        okHttpBuilder.readTimeout(60, TimeUnit.SECONDS)
        val okhttp = okHttpBuilder.build()

        return okhttp

    }

    @Provides
    fun provideConverterFactory(): Converter.Factory {
        return GsonConverterFactory.create()
    }

    @Provides
    fun provideRetrofit(baseUrl:String,converterFactory: Converter.Factory,okHttpClient: OkHttpClient): Retrofit {

        return Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(converterFactory).client(okHttpClient).build()
    }

    @Provides
    fun provideApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }
}