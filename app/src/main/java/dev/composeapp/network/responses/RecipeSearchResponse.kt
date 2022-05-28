package dev.composeapp.network.responses

import com.google.gson.annotations.SerializedName
import dev.composeapp.network.model.RecipeDto

class RecipeSearchResponse (
    @SerializedName("count")
    var count: Int,
    var recipes: List<RecipeDto>
        )