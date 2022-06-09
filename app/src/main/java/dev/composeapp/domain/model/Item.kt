package dev.composeapp.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.ArrayList

@Parcelize
data class Item (
    var status: Map<String, ArrayList<Orden>>? = null,
) : Parcelable