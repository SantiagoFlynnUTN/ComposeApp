package dev.composeapp.network.model

import dev.composeapp.domain.model.Item
import dev.composeapp.domain.utils.DomainMapper

class ItemDTOMapper : DomainMapper<ItemDTO, Item> {
    override fun mapToDomainModel(model: ItemDTO): Item {
        return Item(
            items = model.itemList,
            status = model.status
        )
    }

    override fun mapFromDomainModel(domainModel: Item): ItemDTO {
        TODO("would be the same if we want to upload an item")

    }
}