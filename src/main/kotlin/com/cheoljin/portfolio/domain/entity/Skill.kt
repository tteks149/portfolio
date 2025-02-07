package com.cheoljin.portfolio.domain.entity

import com.cheoljin.portfolio.domain.constant.SkillType
import jakarta.persistence.*

@Entity
class Skill(
    name : String,
    type : String,
    isActive: Boolean
) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    var id: Long? = null // ?는 null 허용

    var name : String = name

    @Column(name = "skill_type") // oracle같은 DB에서 예약어로 쓸수있어서 일반적인 단어 피함
    @Enumerated(value = EnumType.STRING) // ordinum 하면 숫자로 DB에 값이 들어감. 직관적이지않음, SkillType 순서바뀌면 문제
    var type: SkillType = SkillType.valueOf(type)

    var isActive: Boolean = isActive

}