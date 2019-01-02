package uz.startandroid.mvp

import java.lang.ref.WeakReference

/**
 * Base presenter
 */
open class Presenter<V : MvpView> {
    private var viewRef: WeakReference<V>? = null

    val view: V?
        get() {
            return viewRef?.get()
        }

    fun attachView(view: V) {
        viewRef = WeakReference(view)
    }

    fun detachView() {
        viewRef?.clear()
        viewRef = null
    }

    open fun onDestroy() {
    }
}
