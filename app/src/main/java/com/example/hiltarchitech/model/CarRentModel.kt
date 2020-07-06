package com.example.hiltarchitech.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CarRentModel(
    @SerializedName("result")
    val result: List<ResultItem>?
) : Parcelable