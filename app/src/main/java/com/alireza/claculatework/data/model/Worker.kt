package com.alireza.claculatework.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.alireza.claculatework.data.utils.Constants.Companion.WORKER_TABLE

@Entity(WORKER_TABLE)
data class Worker(
    @PrimaryKey(autoGenerate = true)
    var code:Int,
    val name:String,
    val gender:Gender,
    val basketCount:Int?
)