package com.example.newproject0112.di

import com.example.newproject0112.App
import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
            ActivityModule::class,
            AndroidSupportInjectionModule::class,
            AndroidInjectionModule::class,

            AppModule::class,
            ViewModelModule::class,
            NetworkModule::class,
            MoshiModule::class
            ]
)
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application: Application): Builder
        fun networkModule(networkModule: NetworkModule): Builder
        fun build(): AppComponent
    }
    override fun inject(instance : App)

}