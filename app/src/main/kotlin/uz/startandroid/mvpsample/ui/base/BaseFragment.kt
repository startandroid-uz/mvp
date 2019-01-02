package uz.startandroid.mvpsample.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.startandroid.mvp.MvpView
import uz.startandroid.mvp.Presenter
import uz.startandroid.mvp.fragment.MvpFragment

abstract class BaseFragment<V : MvpView, P : Presenter<V>> : MvpFragment<V, P>() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return LayoutInflater.from(context).inflate(getLayout(), container, false)
    }

    abstract fun getLayout(): Int
}
