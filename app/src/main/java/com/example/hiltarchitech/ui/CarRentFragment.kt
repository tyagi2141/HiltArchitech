package com.example.hiltarchitech.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.hiltarchitech.R
import com.example.hiltarchitech.model.ResultData
import com.example.hiltarchitech.ui.adapter.CarRentAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_car_rent.*

@AndroidEntryPoint
class CarRentFragment : Fragment() {

    private val TAG = "MainActivity"

    private val viewmodel by viewModels<CarRentViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_car_rent, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val carRentAdapter = CarRentAdapter()
        recycle.adapter = carRentAdapter
        val repo = viewmodel.getRepositoriesList()

        repo.observe(viewLifecycleOwner, Observer { it ->
            when (it) {
                is ResultData.loading -> {

                }
                is ResultData.success -> {
                    carRentAdapter.submitList(it.data?.result)
                    Log.e("hjgdkfhgkjhdfgd", "" + it.data.toString())
                }
            }
        })
    }
}