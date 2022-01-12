package com.example.dagger_test

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var jugernaut: Jugernaut

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as App).appComponent.inject(this)
        jopa_linbI.text = jugernaut.runduk.rune.name
    }
}