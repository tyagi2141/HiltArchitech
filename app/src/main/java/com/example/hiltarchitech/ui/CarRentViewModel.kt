package com.example.hiltarchitech.ui

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.hiltarchitech.model.CarDetails
import com.example.hiltarchitech.model.ResultData
import com.example.hiltarchitech.usecase.dataUsecase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow

/**
 * Created by Rahul on 02/07/20.
 */
class CarRentViewModel @ViewModelInject constructor(private val usecase: dataUsecase) :
    ViewModel() {

    fun getRepositoriesList(): LiveData<ResultData<CarDetails?>> {
        return flow {
            emit(ResultData.loading())
            try {
                emit(usecase.getRepositryList())
            } catch (e: Exception) {
                e.printStackTrace()
                emit(ResultData.Exception())
            }
        }.asLiveData(Dispatchers.IO)
    }
}