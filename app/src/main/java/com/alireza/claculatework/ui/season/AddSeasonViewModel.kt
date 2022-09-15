package com.alireza.claculatework.ui.season

import androidx.lifecycle.ViewModel
import com.alireza.claculatework.data.model.Season
import com.alireza.claculatework.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddSeasonViewModel @Inject constructor(private val repository: Repository): ViewModel() {


     suspend fun addSeason(season: Season) = repository.insertSeason(season)
}