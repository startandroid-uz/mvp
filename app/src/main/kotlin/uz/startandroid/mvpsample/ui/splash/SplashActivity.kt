package uz.startandroid.mvpsample.ui.splash

import android.content.Intent
import android.os.Bundle
import uz.startandroid.mvpsample.ui.base.BaseActivity
import uz.startandroid.mvpsample.ui.main.MainActivity
import org.koin.android.ext.android.get

class SplashActivity : BaseActivity<SplashView, SplashPresenter>(), SplashView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.onCreate()
    }

    override fun showLanguageSelect() {
        //
    }

    override fun openAuth() {
        //
    }

    override fun openMain() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

    override fun createPresenter(): SplashPresenter = get()

    override fun getMvpView(): SplashView = this
}
