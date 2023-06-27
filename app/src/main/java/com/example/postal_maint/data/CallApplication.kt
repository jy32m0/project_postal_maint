package com.example.postal_maint.data

import android.app.Application

class CallApplication : Application() {

    /** AppContainerDI instance for other classes to obtain dependencies */
    lateinit var containerDI: AppContainerDI
    override fun onCreate() {
        super.onCreate()
        containerDI = AppContainerImpl(this)
    }
}