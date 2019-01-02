package uz.startandroid.mvpsample.di

import uz.startandroid.mvpsample.ui.main.MainPresenter
import uz.startandroid.mvpsample.ui.splash.SplashPresenter
import org.koin.dsl.module.module

object PresenterModule {

    fun get() = module {

        factory { SplashPresenter() }

        factory { MainPresenter() }
    }
}
