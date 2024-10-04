package com.seontaek.portfolio.domain.repository

import com.seontaek.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long>