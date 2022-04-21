package dev.composeapp.network.model

import com.google.gson.annotations.SerializedName

data class ItemDTO (
    @SerializedName("status") var status:String,
    @SerializedName("items") var itemList:List<String>
)