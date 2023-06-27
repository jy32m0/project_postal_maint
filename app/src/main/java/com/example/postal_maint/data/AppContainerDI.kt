package com.example.postal_maint.data

import android.content.Context

/** app container for Dependency Injection */
interface AppContainerDI {
    val callRepository: CallRepository
}

/** AppContainerDI implementation. Provides instance of CallRepoOffline */
class AppContainerImpl(private val context: Context) : AppContainerDI {

    override val callRepository: CallRepository by lazy {
        CallRepoOffline(CallDatabase.getDatabase(context).callDao())
    }

}