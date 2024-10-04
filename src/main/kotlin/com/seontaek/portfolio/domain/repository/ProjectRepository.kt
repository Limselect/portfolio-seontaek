package com.seontaek.portfolio.domain.repository

import com.seontaek.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Project, Long>