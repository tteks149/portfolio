package com.cheoljin.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Introduction(
    content: String,
    isActive: Boolean
) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "introduction_id")
    var id: Long? = null // ?는 null 허용

    var content: String = content
    var isActive: Boolean = isActive
}