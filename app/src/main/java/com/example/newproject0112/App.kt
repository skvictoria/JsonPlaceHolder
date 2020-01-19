package com.example.newproject0112

import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.stetho.Stetho
import com.jakewharton.threetenabp.AndroidThreeTen
import com.squareup.leakcanary.LeakCanary
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import com.example.newproject0112.di.DaggerAppComponent
import com.example.newproject0112.di.NetworkModule
import timber.log.Timber

class App: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.builder()
            .application(this)
            .networkModule(NetworkModule("https://jsonplaceholder.typicode.com"))
            .build()


    override fun onCreate(){
        super.onCreate()

        if (BuildConfig.DEBUG){
            if(LeakCanary.isInAnalyzerProcess(this)) return
            LeakCanary.install(this)

            Timber.plant(Timber.DebugTree())
            Stetho.initializeWithDefaults(this)
        }

        Fresco.initialize(this)
        AndroidThreeTen.init(this)
    }
}
