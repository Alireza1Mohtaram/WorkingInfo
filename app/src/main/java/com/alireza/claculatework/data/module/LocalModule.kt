package com.alireza.claculatework.data.module

import android.content.Context
import androidx.room.Room
import com.alireza.claculatework.data.utils.Constants.Companion.DATABASE_NAME
import com.alireza.claculatework.data.utils.DatabaseFarm
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalModule {
    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) =  Room.databaseBuilder(
                        context,
                        DatabaseFarm::class.java,
                        DATABASE_NAME
                    ).build()

    @Singleton
    @Provides
    fun provideDao(databaseFarm: DatabaseFarm) = databaseFarm.farmDao()


}