package br.com.dscatalog.entities

import java.time.Instant

data class Product (
    private val id: Long,
    private val name: String,
    private val description: String,
    private val price: Double,
    private val imgUrl: String,
    private val date: Instant
)
