package com.alireza.claculatework.data.dao

import androidx.room.*
import com.alireza.claculatework.data.model.Day
import com.alireza.claculatework.data.model.DaysOfSeason
import com.alireza.claculatework.data.model.Season
import com.alireza.claculatework.data.model.Worker
import com.alireza.claculatework.data.utils.Constants.Companion.SEASON_TABLE
import com.alireza.claculatework.data.utils.Constants.Companion.WORKER_TABLE
import kotlinx.coroutines.flow.Flow

@Dao
interface FarmDao {

    // Insertion
    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertSeason(season: Season)

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertSeason(day: Day)

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertSeason(worker: Worker)

    //Query Simple Get
    @Query("SELECT * FROM $SEASON_TABLE")
    fun getSeasons(): Flow<List<Season>>

    @Transaction
    @Query("SELECT * FROM $SEASON_TABLE")
    fun getDaysOfSeason(): Flow<List<DaysOfSeason>>

    @Query("SELECT * FROM $WORKER_TABLE")
    fun getWorkers(): Flow<List<Worker>>


}