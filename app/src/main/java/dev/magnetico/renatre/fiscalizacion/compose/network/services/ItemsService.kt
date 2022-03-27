package dev.magnetico.renatre.fiscalizacion.compose.network.services

import dev.magnetico.renatre.fiscalizacion.compose.network.responses.ItemResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ItemsService {

    @GET
    suspend fun getItemsFromApi(@Url url:String):Response<ItemResponse>
}