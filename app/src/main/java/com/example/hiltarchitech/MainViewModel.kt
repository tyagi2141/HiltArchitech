package com.example.hiltarchitech

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.hiltarchitech.usecase.dataUsecase

/**
 * Created by Rahul on 01/07/20.
 */
class MainViewModel @ViewModelInject constructor(private val usecase: dataUsecase) : ViewModel() {


}