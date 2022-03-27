package dev.magnetico.renatre.fiscalizacion.compose.network.responses

import com.google.gson.annotations.SerializedName

data class ItemResponse (
    @SerializedName("status") var status:String,
    @SerializedName("items") var itemList:List<String>
)