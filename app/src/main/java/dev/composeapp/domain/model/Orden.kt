package dev.composeapp.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Orden(

    var id: String? = null,
    var prov: String? = null

) : Parcelable
