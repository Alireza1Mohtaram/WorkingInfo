package com.alireza.claculatework.data.repository

import com.alireza.claculatework.data.datasource.LocalDataSource
import com.alireza.claculatework.data.model.Season
import javax.inject.Inject

class Repository @Inject constructor(private val localDataSource: LocalDataSource) {

    //season
    fun getSeasons() = localDataSource.getSeasons()
    suspend fun insertSeason(season: Season) = localDataSource.insertSeason(season)
    fun getDaysOfSeason() = localDataSource.getDaysOfSeason()
    fun getWorker() = localDataSource.getWorker()


}