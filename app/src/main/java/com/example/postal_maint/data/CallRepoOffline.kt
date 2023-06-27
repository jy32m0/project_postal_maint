package com.example.postal_maint.data

import kotlinx.coroutines.flow.Flow

class CallRepoOffline(private val callDao: CallDao) : CallRepository {

    override suspend fun insertCall(call: CallEntity) = callDao.insert(call)

    override suspend fun updateCall(call: CallEntity) = callDao.update(call)

    override suspend fun deleteCall(call: CallEntity) = callDao.delete(call)

    override suspend fun deleteAllCalls() = callDao.deleteAll()

    override fun getCall(id: Long):
            Flow<CallEntity?> = callDao.getCall(id)

    override fun getAllCall():
            Flow<List<CallEntity>> = callDao.getAllCall()

    override fun getLastCall():
            Flow<CallEntity?> = callDao.getLastCall()

}