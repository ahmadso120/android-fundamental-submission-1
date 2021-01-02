package com.sopian.github.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Github(
    val username: String,
    val name: String,
    val avatar: Int,
    val company: String,
    val location: String,
    val repository: Int,
    val follower: Int,
    val following: Int
) : Parcelable