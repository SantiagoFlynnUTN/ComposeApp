package dev.composeapp.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Item (
    val status: String? = null,
    val items: List<String>? = null
) : Parcelable