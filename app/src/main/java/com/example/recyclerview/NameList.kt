package com.example.recyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class NameList (
    val imgPeople: Int,
    val namePeople: String,
    val descPeople: String
) : Parcelable
