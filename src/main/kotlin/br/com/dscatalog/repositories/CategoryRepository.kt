package br.com.dscatalog.repositories

import br.com.dscatalog.entities.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository : JpaRepository<Category, Long> {
}