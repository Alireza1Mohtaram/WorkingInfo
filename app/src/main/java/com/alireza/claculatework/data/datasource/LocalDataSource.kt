package com.alireza.claculatework.data.datasource

import com.alireza.claculatework.data.dao.FarmDao
import com.alireza.claculatework.data.model.Season
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val farmDao: FarmDao,
) {

    fun getSeasons() = farmDao.getSeasons()
    fun getDaysOfSeason() = farmDao.getDaysOfSeason()
    fun getWorker() = farmDao.getWorkers()
    suspend fun insertSeason(season: Season) = farmDao.insertSeason(season)

}