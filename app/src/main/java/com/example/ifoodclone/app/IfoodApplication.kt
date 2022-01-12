package com.example.ifoodclone.app

import android.app.Application
import com.example.ifoodclone.app.di.ApplicationComponent
import com.example.ifoodclone.app.di.DaggerApplicationComponent


class IfoodApplication: Application() {



   val appComponent:ApplicationComponent = DaggerApplicationComponent.create()

}