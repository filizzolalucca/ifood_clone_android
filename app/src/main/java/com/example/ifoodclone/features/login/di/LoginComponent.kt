package com.example.ifoodclone.features.login.di

import com.example.ifoodclone.features.login.ui.SplashActivity
import dagger.Subcomponent


@Subcomponent
interface LoginComponent {

    // Factory that is used to create instances of this subcomponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }


    fun injectSplash(activity: SplashActivity)

}