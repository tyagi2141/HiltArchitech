package com.example.hiltarchitech.di

import com.example.hiltarchitech.network.ApiService
import com.example.hiltarchitech.repositroy.DataRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

/**
 * Created by Rahul on 01/07/20.
 */
@InstallIn(ActivityRetainedComponent::class)

@Module
object RepositoryModule {

    @Provides
    fun provideRepository(apiService: ApiService): DataRepository {
        return DataRepository(apiService)
    }
}