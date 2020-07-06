package com.example.hiltarchitech.model


import com.google.gson.annotations.SerializedName

data class CarDetails(@SerializedName("result")
                      val result: List<ResultItems>)


data class ResultItems(@SerializedName("pincode")
                      val pincode: String = "",
                      @SerializedName("driver_id")
                      val driverId: String = "",
                      @SerializedName("flag")
                      val flag: String = "",
                      @SerializedName("drivername")
                      val drivername: String = "",
                      @SerializedName("date_of_birth")
                      val dateOfBirth: String = "",
                      @SerializedName("mobile")
                      val mobile: String = "",
                      @SerializedName("dates")
                      val dates: String = "",
                      @SerializedName("addressid")
                      val addressid: String = "",
                      @SerializedName("imageurl")
                      val imageurl: String = "",
                      @SerializedName("driver_charges")
                      val driverCharges: String = "",
                      @SerializedName("location")
                      val location: String = "",
                      @SerializedName("id")
                      val id: String = "",
                      @SerializedName("vechile_type")
                      val vechileType: String = "",
                      @SerializedName("aprovell")
                      val aprovell: String = "",
                      @SerializedName("uniqueid")
                      val uniqueid: String = "")


