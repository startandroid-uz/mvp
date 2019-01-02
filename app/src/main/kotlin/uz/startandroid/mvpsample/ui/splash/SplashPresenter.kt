package uz.startandroid.mvpsample.ui.splash

import uz.startandroid.mvp.Presenter

class SplashPresenter : Presenter<SplashView>() {

    fun onCreate() {
        view?.openMain()
    }
}
