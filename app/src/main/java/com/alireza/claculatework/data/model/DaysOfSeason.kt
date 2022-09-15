package com.alireza.claculatework.data.model

import androidx.room.Embedded
import androidx.room.Relation

data class DaysOfSeason (
    @Embedded val season: Season,
    @Relation(parentColumn = "code" , entityColumn = "seasonCode")
    val days:List<Day>
        )
