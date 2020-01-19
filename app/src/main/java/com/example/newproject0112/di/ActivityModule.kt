package com.example.newproject0112.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import com.example.newproject0112.ui.MainActivity

@Module
abstract class ActivityModule{

    @ContributesAndroidInjector
    abstract fun main(): MainActivity

    /*@ContributesAndroidInjector
    abstract fun login() : LoginActivity*/
}