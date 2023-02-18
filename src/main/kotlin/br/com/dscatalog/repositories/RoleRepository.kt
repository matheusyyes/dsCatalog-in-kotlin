package br.com.dscatalog.repositories

import br.com.dscatalog.entities.Role
import org.springframework.data.jpa.repository.JpaRepository
interface RoleRepository : JpaRepository<Role, Long> {
}