package br.com.dscatalog.entities

import jakarta.persistence.*
import java.time.Instant

@Entity
@Table(name = "tb_product")
data class Product (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long,
    private val name: String,
    @Column(columnDefinition = "TEXT")
    private val description: String,
    private val price: Double,
    private val imgUrl: String,

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private val date: Instant,

    @ManyToMany
    @JoinTable(
        name="tb_product_category",
        joinColumns = [JoinColumn(name = "product_id")],
        inverseJoinColumns = [JoinColumn(name = "category_id")]
    )
    private val categories: Set<Category> = HashSet()
)
