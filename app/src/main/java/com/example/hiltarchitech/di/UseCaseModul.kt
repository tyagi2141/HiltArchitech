package com.example.hiltarchitech.di

import com.example.hiltarchitech.repositroy.DataRepository
import com.example.hiltarchitech.usecase.dataUsecase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

/**
 * Created by Rahul on 01/07/20.
 */

@InstallIn(ActivityRetainedComponent::class)

@Module
object UseCaseModul {

    @Provides
    fun providerUsecasemodule(dataRepository: DataRepository): dataUsecase {
        return dataUsecase(dataRepository)
    }
}