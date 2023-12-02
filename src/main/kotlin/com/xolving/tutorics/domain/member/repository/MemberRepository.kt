package com.xolving.tutorics.domain.member.repository

import com.xolving.tutorics.domain.member.entity.Member
import org.springframework.data.jpa.repository.JpaRepository


interface MemberRepository : JpaRepository<Member, Long>{}