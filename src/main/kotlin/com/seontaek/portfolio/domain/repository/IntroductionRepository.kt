package com.seontaek.portfolio.domain.repository

import com.seontaek.portfolio.domain.entity.Achievement
import com.seontaek.portfolio.domain.entity.Experience
import com.seontaek.portfolio.domain.entity.HttpInterface
import com.seontaek.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction, Long>