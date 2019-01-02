package uz.startandroid.mvpsample

import android.app.Application
import uz.startandroid.mvpsample.di.AppModule
import uz.startandroid.mvpsample.di.DataModule
import uz.startandroid.mvpsample.di.NetworkModule
import uz.startandroid.mvpsample.di.PresenterModule
import org.koin.android.ext.android.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(
            context = this,
            modules = listOf(
                AppModule.get(this),
                NetworkModule.get(),
                DataModule.get(),
                PresenterModule.get()
            )
        )
    }
}
