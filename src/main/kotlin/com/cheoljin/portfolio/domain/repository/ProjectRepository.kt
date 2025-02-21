package com.cheoljin.portfolio.domain.repository

import com.cheoljin.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Project, Long> {


    fun findAllByIsActive(isActive: Boolean): List<Project>

}

