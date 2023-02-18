package br.com.dscatalog.repositories

import br.com.dscatalog.entities.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
}