package com.example.bottomtest

import android.app.Application
import timber.log.Timber

class GlobalApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}