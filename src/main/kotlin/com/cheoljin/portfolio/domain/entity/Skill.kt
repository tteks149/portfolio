package com.cheoljin.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Skill : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    var id: Long? = null // ?는 null 허용
}