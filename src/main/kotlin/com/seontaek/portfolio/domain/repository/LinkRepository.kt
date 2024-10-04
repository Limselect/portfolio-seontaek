package com.seontaek.portfolio.domain.repository

import com.seontaek.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long>