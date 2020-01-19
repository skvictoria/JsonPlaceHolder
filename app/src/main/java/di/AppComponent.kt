package di

import App
import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import ui.PhotoListViewModel
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
        fun build(): AppComponent
        fun networkModule(networkModule: NetworkModule): Builder
    }
    override fun inject(instance : App)

}