package com.cheoljin.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Achievement : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "achievement_id")
    var id: Long? = null // ?는 null 허용
}