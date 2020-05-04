package com.example.crudapi


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class DataDosen(
    var nik : String="",
    var nama : String="",
    var no_hp : String="",
    var key : String=""
):Parcelable
