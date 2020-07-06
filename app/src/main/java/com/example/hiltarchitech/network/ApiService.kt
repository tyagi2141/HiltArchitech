package com.example.hiltarchitech.network

import com.example.hiltarchitech.model.CarDetails
import com.example.hiltarchitech.utility.NetworkUtil
import retrofit2.http.GET

/**
 * Created by Rahul on 01/07/20.
 */
interface ApiService {

    @GET(NetworkUtil.URL_REPOSITORIES)
    suspend fun getCarRentData(): CarDetails

}