package com.cheoljin.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Project : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    var id: Long? = null // ?는 null 허용
}