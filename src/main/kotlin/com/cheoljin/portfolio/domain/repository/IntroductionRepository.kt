package com.cheoljin.portfolio.domain.repository

import com.cheoljin.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction, Long> {


    // select * from introduction where is_active = :isActive

    fun findAllByIsActive(isActive: Boolean): List<Introduction>
}