package dev.composeapp.network.model

import com.google.gson.annotations.SerializedName
import java.util.ArrayList

data class OrdenDTO (
    @SerializedName("id") var id:String,
    @SerializedName("prov") var prov:String,
)

/*
{
    "data": {
        "toInspect": [
            {
                "id": 12,
                "prov": "buenos Aires"
            },
 */