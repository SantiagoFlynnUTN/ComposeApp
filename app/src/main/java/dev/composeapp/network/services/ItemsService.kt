package dev.composeapp.network.services

import dev.composeapp.network.model.ItemDTO
import retrofit2.http.GET
import retrofit2.http.Url

interface ItemsService {

    @GET
    suspend fun getItemsFromApi(@Url url:String
    ):ItemDTO
}