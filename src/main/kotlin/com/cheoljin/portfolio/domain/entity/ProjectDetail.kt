package com.cheoljin.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class ProjectDetail(content: String, url:String?, isActive: Boolean) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_detail_id")
    var id: Long? = null // ?는 null 허용

    var content: String = content
    var url : String? = url
    var isActive: Boolean = isActive

    fun update(content:String, url:String?,isActive: Boolean){
        this.content = content
        this.isActive = isActive
        this.url = url
    }



}