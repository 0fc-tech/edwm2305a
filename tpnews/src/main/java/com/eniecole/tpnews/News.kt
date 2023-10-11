package com.eniecole.tpnews

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class News(
    val id: Long,
    val title: String,
    val content: String,
    val contentShort: String,
) : Parcelable
