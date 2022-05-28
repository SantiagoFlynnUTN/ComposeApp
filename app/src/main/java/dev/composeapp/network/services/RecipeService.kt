package dev.composeapp.network.services

import dev.composeapp.network.model.RecipeDto
import dev.composeapp.network.responses.RecipeSearchResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface RecipeService {

    @GET("search")
    suspend fun search(
        @Header("authorization") token:String,
        @Query("page") page: Int,
        @Query("query") query: String
    ) : RecipeSearchResponse

    @GET("get")
    suspend fun get(
        @Header("authorization") token: String,
        @Query("id") id: Int
    ) : RecipeDto
}