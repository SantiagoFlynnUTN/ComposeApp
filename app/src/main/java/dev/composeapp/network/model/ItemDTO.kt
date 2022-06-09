package dev.composeapp.network.model

import com.google.gson.annotations.SerializedName
import java.util.ArrayList

data class ItemDTO (
    @SerializedName("data") var data:ModelDTO,
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