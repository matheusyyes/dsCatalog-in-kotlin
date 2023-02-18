package br.com.dscatalog.entities

import jakarta.persistence.*
import java.time.Instant

@Entity
@Table(name = "tb_category")
data class Category(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long,
    private val name: String,

    @ManyToMany(mappedBy = "categories")
    private val products: Set<Product>,

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private val createdAt: Instant,
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private val updatedAt: Instant
)
