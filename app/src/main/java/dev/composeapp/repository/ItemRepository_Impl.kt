package dev.composeapp.repository

import dev.composeapp.domain.model.Item
import dev.composeapp.network.model.ItemDTOMapper
import dev.composeapp.network.services.ItemsService

class ItemRepository_Impl(
    private val itemsService: ItemsService,
    private val mapper: ItemDTOMapper
) : ItemRepository {

    /*override suspend fun search(token: String, page: Int, query: String): List<String> {
        val result = itemsService.getItemsFromApi("get").itemList
        return mapper.mapToDomainModel(result)
    }*/

    override suspend fun get(token: String, id: Int): Item {
        val result = itemsService.getItemsFromApi("get")
        return mapper.mapToDomainModel(result);
    }
}