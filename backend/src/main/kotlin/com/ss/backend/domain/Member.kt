package com.ss.backend.domain

import com.ss.backend.dto.Role
import com.ss.backend.global.TimeStamp
import jakarta.persistence.*

@Entity
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    var name: String,
    var email: String,

    @Enumerated(EnumType.STRING)
    var role: Role,

) : TimeStamp()

