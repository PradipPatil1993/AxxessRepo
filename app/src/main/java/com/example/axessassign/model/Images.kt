package com.example.axessassign.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Images(
        var data :  List<Data>,
        var success : Boolean,
        var status :Int

):Parcelable