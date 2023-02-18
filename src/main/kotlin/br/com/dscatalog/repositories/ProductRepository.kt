package br.com.dscatalog.repositories

import br.com.dscatalog.entities.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long> {
}