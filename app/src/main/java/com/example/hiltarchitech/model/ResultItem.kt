package com.example.hiltarchitech.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ResultItem(
    @SerializedName("perhrcharge")
    val perhrcharge: String = "",
    @SerializedName("cartype")
    val cartype: String = "",
    @SerializedName("mobile")
    val mobile: String = "",
    @SerializedName("ownerid")
    val ownerid: String = "",
    @SerializedName("addressid")
    val addressid: String = "",
    @SerializedName("carseat")
    val carseat: String = "",
    @SerializedName("bookdates")
    val bookdates: String = "",
    @SerializedName("approve")
    val approve: String = "",
    @SerializedName("carname")
    val carname: String = "",
    @SerializedName("milages")
    val milages: String = "",
    @SerializedName("imageurl")
    val imageurl: String = "",
    @SerializedName("carmodel")
    val carmodel: String = "",
    @SerializedName("location")
    val location: String = "",
    @SerializedName("id")
    val id: String = ""
) : Parcelable