package com.example.dagger_test.DI

import com.example.dagger_test.MainActivity
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(act: MainActivity)
}