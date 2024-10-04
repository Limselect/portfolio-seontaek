package com.seontaek.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Experience(title: String,
    description: String,
    startYear: Int,
    startMonth: Int,
    endYear: Int?,
    endMonth: Int?,
    isActive: Boolean
) : BaseEntity() {

    //    Id 어노테이션: 이 필드가 PK라는 것을 알림
    @Id
//    Strategy 파라미터를 삽입할 수 있다: PK 생성 전략.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    이 필드가 DB에 어떤 컬럼과 맵핑 되는지 개발자가 직접 징정해주는 기능
    @Column(name = "experience_id")
//  자료형 뒤에 ?을 붙이면 null을 허용한다.
    var id: Long? = null

    var title: String = title

    var description: String = description

    var startYear: Int = startYear

    var startMonth: Int = startMonth

    var endYear: Int? = endYear

    var endMonth: Int? = endMonth

    @OneToMany(targetEntity = ExperienceDetail::class,
        fetch = FetchType.LAZY,
        cascade = [CascadeType.ALL])
    @JoinColumn(name = "experience_id")
    var details: MutableList<ExperienceDetail> = mutableListOf()

    fun getEndYearMonth(): String {
        if (endYear == null || endMonth == null) {
            return "Present"
        }
        return "${endYear}.${endMonth}"
    }

    fun update(title: String,
               description: String,
               startYear: Int,
               startMonth: Int,
               endYear: Int?,
               endMonth: Int?,
               isActive: Boolean
    ) {
        this.title = title
        this.description = description
        this.startYear = startYear
        this.startMonth = startMonth
        this.endYear = endYear
        this.endMonth = endMonth
        this.isActive = isActive
    }

    fun addDetails(details: MutableList<ExperienceDetail>) {
        if (details != null) {
            this.details.addAll(details)
        }
    }

}