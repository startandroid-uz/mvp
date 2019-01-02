package uz.startandroid.mvpsample.di

import android.app.Application
import com.google.gson.GsonBuilder
import org.koin.dsl.module.module

object AppModule {

    fun get(app: Application) = module {
        single { app }
        single { GsonBuilder().create() }
    }
}
