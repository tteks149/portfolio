package com.cheoljin.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class ExperienceDetail : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_detail_id")
    var id: Long? = null // ?는 null 허용
}