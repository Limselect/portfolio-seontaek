package com.seontaek.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class HttpInterface : BaseEntity() {

    //    Id 어노테이션: 이 필드가 PK라는 것을 알림
    @Id
//    Strategy 파라미터를 삽입할 수 있다: PK 생성 전략.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    이 필드가 DB에 어떤 컬럼과 맵핑 되는지 개발자가 직접 징정해주는 기능
    @Column(name = "http_interface_id")
//  자료형 뒤에 ?을 붙이면 null을 허용한다.
    var id: Long? = null

//    기존 방법은
//    val achievement: Achievement  (생성)
//    achievement.achievementId     (조회)

}