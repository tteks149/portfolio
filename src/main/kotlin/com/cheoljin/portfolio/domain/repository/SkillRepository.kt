package com.cheoljin.portfolio.domain.repository

import com.cheoljin.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long>