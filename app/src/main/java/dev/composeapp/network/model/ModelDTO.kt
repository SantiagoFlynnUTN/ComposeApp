package dev.composeapp.network.model

import com.google.gson.annotations.SerializedName
import java.util.ArrayList

data class ModelDTO (
    @SerializedName("toInspect") var toInspect:ArrayList<OrdenDTO>,
)
