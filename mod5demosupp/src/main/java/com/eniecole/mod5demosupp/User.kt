package com.eniecole.mod5demosupp

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.LocalDateTime

@Parcelize
data class User(
    var nom:String,
    var prenom: String,
    val dateNaissance : LocalDateTime,
    val email : String,
) : Parcelable