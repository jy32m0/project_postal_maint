package com.example.postal_maint.viewmodel

import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.postal_maint.data.CallApplication

object AppViewModelProvider {

    val Factory = viewModelFactory {

        initializer {
            HomeViewModel(
//                this.createSavedStateHandle(),
                callApplication().containerDI.callRepository
            )
        }
        initializer {
            DBCViewModel(
                this.createSavedStateHandle(),
                callApplication().containerDI.callRepository
            )
        }
        initializer {
            EquipViewModel(
                this.createSavedStateHandle(),
                callApplication().containerDI.callRepository
            )
        }
        initializer {
            DetailViewModel(
                this.createSavedStateHandle(),
                callApplication().containerDI.callRepository
            )
        }
        initializer {
            LogViewModel(
                this.createSavedStateHandle(),
                callApplication().containerDI.callRepository
            )
        }
    }
}

fun CreationExtras.callApplication(): CallApplication =
    (this[AndroidViewModelFactory.APPLICATION_KEY] as CallApplication)