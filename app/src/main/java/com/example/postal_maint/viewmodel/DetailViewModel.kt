package com.example.postal_maint.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.postal_maint.data.CallRepository

class DetailViewModel(
    savedStateHandle: SavedStateHandle,
    private val callRepository: CallRepository
) : ViewModel() {

}