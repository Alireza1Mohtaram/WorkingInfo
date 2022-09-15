package com.alireza.claculatework.ui.season


import androidx.lifecycle.ViewModel
import com.alireza.claculatework.data.model.Season
import com.alireza.claculatework.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject


@HiltViewModel
class SeasonViewModel @Inject constructor(private val repository: Repository): ViewModel(){
   private val seasonStateFlow: MutableStateFlow<List<Season>> =
       MutableStateFlow(listOf<Season>())

    val fetchSeasons: StateFlow<List<Season>> = seasonStateFlow

    fun getSeasons() = repository.getSeasons()


}