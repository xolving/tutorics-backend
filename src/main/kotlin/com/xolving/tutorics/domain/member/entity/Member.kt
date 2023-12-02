package com.xolving.tutorics.domain.member.entity

import jakarta.persistence.*
import jakarta.persistence.Entity

@Table
@Entity
class Member(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(columnDefinition = "VARCHAR(320)")
    var email: String? = null,

    @Column(columnDefinition = "VARCHAR(32)")
    var username: String? = null,

    @Column(columnDefinition = "VARCHAR(64)")
    var password: String? = null
)