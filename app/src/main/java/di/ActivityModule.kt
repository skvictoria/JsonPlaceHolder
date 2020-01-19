package di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ui.MainActivity

@Module
abstract class ActivityModule{

    @ContributesAndroidInjector
    abstract fun main(): MainActivity

    /*@ContributesAndroidInjector
    abstract fun login() : LoginActivity*/
}