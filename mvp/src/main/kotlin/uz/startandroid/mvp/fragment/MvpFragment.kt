package uz.startandroid.mvp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import uz.startandroid.mvp.MvpView
import uz.startandroid.mvp.Presenter

abstract class MvpFragment<V : MvpView, P : Presenter<V>> : Fragment() {

    protected lateinit var presenter: P

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter = createPresenter()
        presenter.attachView(getMvpView())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        presenter.detachView()
        presenter.onDestroy()
    }

    abstract fun createPresenter(): P

    abstract fun getMvpView(): V
}
