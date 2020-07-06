package com.example.hiltarchitech.repositroy

import com.example.hiltarchitech.model.CarDetails
import com.example.hiltarchitech.network.ApiService
import javax.inject.Inject

/**
 * Created by Rahul on 01/07/20.
 */
class DataRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getCarRentRepo(): CarDetails {
        return apiService.getCarRentData()
    }
}