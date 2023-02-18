package br.com.dscatalog.entities

import jakarta.persistence.*

@Entity
@Table(name = "tb_role")
data class Role(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long,
    private val authority: String
)
