package com.seontaek.portfolio.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

@MappedSuperclass
abstract class BaseEntity {

//    jpa가 생성된 시간을 자동으로 세팅해준다.
    @CreatedDate
//    필드와 DB COLUMN에 맵핑을 함.
//    null 값이 확인되면 false, 처음 설정된 값이 변경될 경우 false.
    @Column(nullable = false, updatable = false)
    var createDateTime: LocalDateTime = LocalDateTime.now()

//    데이터가 마지막으로 수정된 시간을 세팅해준다.
    @LastModifiedDate
    @Column(nullable = false)
    var updatedDateTime: LocalDateTime = LocalDateTime.now()

}