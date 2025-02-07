package com.cheoljin.portfolio.domain.repository

import com.cheoljin.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository : JpaRepository<Achievement, Long>