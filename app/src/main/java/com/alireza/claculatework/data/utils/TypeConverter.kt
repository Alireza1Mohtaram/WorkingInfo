package com.alireza.claculatework.data.utils

import androidx.room.TypeConverter
import com.alireza.claculatework.data.model.Fruit
import com.alireza.claculatework.data.model.Gender
import java.util.*


class TypeConverter {

    @TypeConverter
    fun intToFruit(int: Int): Fruit {
        if (int == Fruit.Lemon.ordinal) return Fruit.Lemon
        else if (int == Fruit.Chino.ordinal) return Fruit.Chino
        else if (int == Fruit.Mango.ordinal) return Fruit.Mango
        return Fruit.Palm
    }

    @TypeConverter
    fun fruitToInt(fruit: Fruit): Int {
        if (Fruit.Lemon.ordinal == 0) return 0
        else if (Fruit.Chino.ordinal == 1) return 1
        else if (Fruit.Palm.ordinal == 2) return 2
        return 3
    }

    @TypeConverter
    fun toGender(gender:Char):Gender{
        if (gender.equals('F'))return Gender.FEMALE
        return Gender.MALE
    }
    @TypeConverter
    fun toChar(gender: Gender) : Char{
        if (gender ==Gender.FEMALE) return 'F'
        return 'M'
    }
}