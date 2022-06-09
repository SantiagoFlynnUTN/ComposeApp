package dev.composeapp.network.model

import dev.composeapp.domain.model.Item
import dev.composeapp.domain.model.Orden
import dev.composeapp.domain.utils.DomainMapper

class ItemDTOMapper : DomainMapper<ItemDTO, Item> {
    override fun mapToDomainModel(model: ItemDTO): Item {

        var arrOrders : ArrayList<Orden> = ArrayList()
        var order = Orden()
        order.id = model.data.toInspect[0].id
        order.prov = model.data.toInspect[0].prov
        arrOrders.add(order)

        var map : HashMap<String,ArrayList<Orden>> = HashMap()
        map["toInspect"] = arrOrders
        var item = Item()
        item.status = map

        return item
    }

    override fun mapFromDomainModel(domainModel: Item): ItemDTO {
        TODO("would be the same if we want to upload an item")

    }
}