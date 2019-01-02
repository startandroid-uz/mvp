package uz.startandroid.mvp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.startandroid.mvp.MvpView
import uz.startandroid.mvp.Presenter

/**
 * Base mvp activity
 */
abstract class MvpActivity<V : MvpView, P : Presenter<V>> : AppCompatActivity() {

    protected lateinit var presenter: P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = createPresenter()
        presenter.attachView(getMvpView())
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
        presenter.onDestroy()
    }

    abstract fun createPresenter(): P

    abstract fun getMvpView(): V
}
