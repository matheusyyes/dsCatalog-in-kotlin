package br.com.dscatalog.entities

data class User(
    private val id: Long,
    private val firstName: String,
    private val lastName: String,
    private val email: String,
    private val password: String
)
