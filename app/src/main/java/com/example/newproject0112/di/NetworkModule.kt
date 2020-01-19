package com.example.newproject0112.di

import com.facebook.stetho.okhttp3.StethoInterceptor
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import com.example.newproject0112.di.util.RxErrorHandlingCallAdapterFactory
import io.reactivex.schedulers.Schedulers
import com.example.newproject0112.model.PhotoService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule(private val baseUrl: String){

    @Provides
    @Singleton
    fun provideHttpClient(): OkHttpClient =
        OkHttpClient.Builder()
            .addNetworkInterceptor(StethoInterceptor())
            .build()

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient, moshi: Moshi): Retrofit =
        /*val client = OkHttpClient.Builder().build()*/
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .client(OkHttpClient.Builder().build())
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(RxErrorHandlingCallAdapterFactory.create(Schedulers.io()))
            .build()

    @Provides
    @Singleton
    fun provideUserService(retrofit: Retrofit): PhotoService =
        retrofit.create(PhotoService::class.java)

}