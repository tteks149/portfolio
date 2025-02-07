package com.cheoljin.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class HttpInterface : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "http_interface_id")
    var id: Long? = null // ?는 null 허용
}