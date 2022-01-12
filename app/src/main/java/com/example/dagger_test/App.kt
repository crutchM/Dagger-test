package com.example.dagger_test

import android.app.Application
import com.example.dagger_test.DI.AppComponent
import com.example.dagger_test.DI.DaggerAppComponent

class App : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }

}