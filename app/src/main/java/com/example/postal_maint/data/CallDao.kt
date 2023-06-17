package com.example.postal_maint.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface CallDao {

    @Insert
    suspend fun insert(call: CallEntity)

    @Update
    suspend fun update(call: CallEntity)

    @Delete
    suspend fun delete(call: CallEntity?)

    @Query("DELETE FROM call_table")
    fun deleteAll()

    @Query("SELECT * FROM call_table WHERE callID = :id")
    fun getCall(id: Long): Flow<CallEntity?>

    @Query("SELECT * FROM call_table ORDER BY callID DESC")
    fun getAllFlow(): Flow<List<CallEntity>>

    @Query("SELECT * FROM call_table ORDER BY callID DESC LIMIT 1")
    fun getLastCall(): Flow<CallEntity?>

}