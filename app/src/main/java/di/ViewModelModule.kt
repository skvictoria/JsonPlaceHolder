package di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
/*
    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun login(loginViewModel: LoginViewModel):ViewModel*/

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory):ViewModelProvider.Factory
}