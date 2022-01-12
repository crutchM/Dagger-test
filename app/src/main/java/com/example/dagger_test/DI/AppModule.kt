package com.example.dagger_test.DI

import com.example.dagger_test.Jugernaut
import com.example.dagger_test.Runduk
import com.example.dagger_test.Rune
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideRune() : Rune {
        return Rune("bounty rune")
    }

    @Provides
    fun provideRunduk(rune: Rune) : Runduk {
        return Runduk(rune)
    }

    @Provides
    fun provideJugernaut(runduk: Runduk) : Jugernaut{
        return Jugernaut(runduk)
    }

}