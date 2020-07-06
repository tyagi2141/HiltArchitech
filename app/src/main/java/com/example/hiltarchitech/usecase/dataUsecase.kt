package com.example.hiltarchitech.usecase

import com.example.hiltarchitech.model.CarDetails
import com.example.hiltarchitech.model.ResultData
import com.example.hiltarchitech.repositroy.DataRepository
import javax.inject.Inject

/**
 * Created by Rahul on 01/07/20.
 */
class dataUsecase @Inject constructor(private val dataRepository: DataRepository) {

    suspend fun getRepositryList(): ResultData<CarDetails> {
        val publicRepositoryList = dataRepository.getCarRentRepo()

        val resultData = if (publicRepositoryList != null) {
            ResultData.success(publicRepositoryList)
        } else {
            ResultData.Failed("something went wrong")
        }

        return resultData
    }
}