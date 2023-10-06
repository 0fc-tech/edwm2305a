package com.eniecole.cadox.bo

import android.os.Build
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.time.LocalDate
@Parcelize
data class Article(
    val id: Long,
    var intitule: String,
    var description: String,
    var prix: Double,
    var niveau: Byte,
    var url: String? = null,
    var achete: Boolean = false,
    var dateAchat: LocalDate? = null
) : Parcelable

