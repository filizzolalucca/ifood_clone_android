package com.example.ifoodclone.app.di

import com.example.ifoodclone.features.login.di.LoginComponent
import com.example.ifoodclone.features.login.di.LoginSubComponents
import com.example.ifoodclone.features.login.ui.SplashActivity
import dagger.Component
import javax.inject.Singleton

// Including SubcomponentsModule, tell ApplicationComponent that
// LoginComponent is its subcomponent.
@Singleton
@Component(modules = [LoginSubComponents::class])
interface ApplicationComponent {
    fun loginComponent(): LoginComponent.Factory

}