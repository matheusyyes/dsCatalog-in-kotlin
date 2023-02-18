package br.com.dscatalog.entities

import jakarta.persistence.*

@Entity
@Table(name = "tb_user")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long,
    private val firstName: String,
    private val lastName: String,
    @Column(unique = true)
    private val email: String,
    private val password: String,

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "tb_user_role",
        joinColumns = [JoinColumn(name = "user_id")],
        inverseJoinColumns = [JoinColumn(name = "role_id")]
    )
    private val roles: Set<Role> = HashSet()
)
