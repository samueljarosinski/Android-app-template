package com.example

import android.os.StrictMode
import timber.log.Timber

@Suppress("unused")
class DebugExampleApplication : ExampleApplication() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())

        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())
        StrictMode.setVmPolicy(StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build())
    }
}
