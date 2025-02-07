package com.cheoljin.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class ProjectDetail : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_detail_id")
    var id: Long? = null // ?는 null 허용
}