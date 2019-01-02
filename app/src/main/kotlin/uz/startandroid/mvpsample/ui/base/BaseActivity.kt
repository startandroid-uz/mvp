package uz.startandroid.mvpsample.ui.base

import androidx.appcompat.app.AlertDialog
import uz.startandroid.mvpsample.R
import uz.startandroid.mvp.MvpView
import uz.startandroid.mvp.Presenter
import uz.startandroid.mvp.activity.MvpActivity

abstract class BaseActivity<V : MvpView, P : Presenter<V>> : MvpActivity<V, P>(), BaseMvpView {

    fun setHomeAsUp() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    override fun showNoNetworkAlert() {
        showAlert(R.string.alert_message_no_network)
    }

    fun showAlert(messageRes: Int) {
        showAlert(getString(messageRes))
    }

    fun showAlert(message: String) {
        AlertDialog.Builder(this)
            .setMessage(message)
            .setPositiveButton(R.string.alert_button_ok, null)
            .show()
    }
}
