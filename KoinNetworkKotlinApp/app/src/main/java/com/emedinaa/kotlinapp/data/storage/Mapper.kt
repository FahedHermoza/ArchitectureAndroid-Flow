package com.emedinaa.kotlinapp.data.storage

import com.emedinaa.kotlinapp.data.storage.remote.ProductDTO
import com.emedinaa.kotlinapp.data.storage.remote.UserDTO
import com.emedinaa.kotlinapp.domain.model.Product
import com.emedinaa.kotlinapp.domain.model.User

/**
 * https://kotlinlang.org/docs/reference/collection-transformations.html
 * http://modelmapper.org/
 */
object Mapper {

    //TODO convertir entidad a DTO y DTO a entidad
    fun userDTOToUser(userDTO: UserDTO): User =
        User(
            userDTO.token ?: "", userDTO.email ?: "", userDTO.objectId ?: "",
            userDTO.code, userDTO.message
        )

    fun productDTOToProduct(productDTO: ProductDTO): Product = Product(
        productDTO.objectId ?: "", productDTO.name ?: "", productDTO.description ?: "",
        productDTO.cost ?: 0.0, productDTO.logo ?: "", productDTO.code ?: ""
    )

    fun productToProductDTO(product: Product): ProductDTO = ProductDTO(
        product.objectId, product.name,
        product.description, product.cost, product.logo, product.code
    )

}