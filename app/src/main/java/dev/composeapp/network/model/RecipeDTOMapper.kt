package dev.composeapp.network.model

import dev.composeapp.domain.model.Recipe
import dev.composeapp.domain.utils.DomainMapper

class RecipeDTOMapper: DomainMapper<RecipeDto, Recipe> {

    override fun mapFromEntity(dto: RecipeDto): Recipe {
        return Recipe(
            id = dto.pk,
            title = dto.title,
            featuredImage = dto.featuredImage,
            rating = dto.rating,
            publisher = dto.publisher,
            sourceUrl = dto.sourceUrl,
            ingredients = dto.ingredients,
            dateAdded = dto.dateAdded,
            dateUpdated = dto.dateUpdated,
        )
    }

    override fun mapToEntity(domainModel: Recipe): RecipeDto {
        return RecipeDto(
            pk = domainModel.id,
            title = domainModel.title,
            featuredImage = domainModel.featuredImage,
            rating = domainModel.rating,
            publisher = domainModel.publisher,
            sourceUrl = domainModel.sourceUrl,
            ingredients = domainModel.ingredients,
            dateAdded = domainModel.dateAdded,
            dateUpdated = domainModel.dateUpdated,
        )
    }

    fun fromEntityList(initial: List<RecipeDto>): List<Recipe>{
        return initial.map { mapFromEntity(it) }
    }

    fun toEntityList(initial: List<Recipe>): List<RecipeDto>{
        return initial.map { mapToEntity((it)) }
    }
}