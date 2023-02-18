package br.com.dscatalog.entities

import java.time.Instant

data class Category(
    private val id: Long,
    private val name: String,
    private val products: Set<Product>,
    private val createdAt: Instant,
    private val updatedAt: Instant
)
