package com.dicoding.projek

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class food(
    val name: String,
    val description: String,
    val photo: Int
) : Parcelable