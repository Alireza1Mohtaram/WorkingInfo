package com.alireza.claculatework.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.alireza.claculatework.data.model.Fruit
import com.alireza.claculatework.data.utils.Constants.Companion.SEASON_TABLE

@Entity(SEASON_TABLE)
data class Season (
    @PrimaryKey(autoGenerate = true)
    val code:Int,
    val name:String,
    val fruit: Fruit,
    val series:Int
        )