package dev.composeapp.network.services

import dev.composeapp.network.model.ItemResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ItemsService {

    @GET
    suspend fun getItemsFromApi(@Url url:String):Response<ItemResponse>
}