package com.alireza.claculatework.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.alireza.claculatework.data.utils.Constants.Companion.DAY_TABLE

@Entity(DAY_TABLE)
data class Day (
    @PrimaryKey(autoGenerate = true)
    val code:Int,
    val seasonCode:Int,
    val name:String,
    var feeFruit:Int?,
    var feeWorker:Int?,
    var weight:Int?,
    var customerName:String,
)