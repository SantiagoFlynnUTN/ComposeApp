package dev.composeapp.repository

import dev.composeapp.domain.model.Item

interface ItemRepository {

    //suspend fun search(token:String, page:Int, query:String):Item

    suspend fun get(token: String, id:Int):Item
}