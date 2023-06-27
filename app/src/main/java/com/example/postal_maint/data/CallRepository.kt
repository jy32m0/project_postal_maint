package com.example.postal_maint.data

import kotlinx.coroutines.flow.Flow

interface CallRepository {


    fun getCall(id: Long): Flow<CallEntity?>

    suspend fun insertCall(call: CallEntity)

    suspend fun updateCall(call: CallEntity)

    suspend fun deleteCall(call: CallEntity)

    suspend fun deleteAllCalls()

    fun getAllCall(): Flow<List<CallEntity>>

    fun getLastCall(): Flow<CallEntity?>

}