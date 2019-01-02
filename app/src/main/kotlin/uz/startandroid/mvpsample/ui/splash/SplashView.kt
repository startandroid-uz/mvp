package uz.startandroid.mvpsample.ui.splash

import uz.startandroid.mvp.MvpView

interface SplashView : MvpView {

    fun showLanguageSelect()

    fun openAuth()

    fun openMain()
}
