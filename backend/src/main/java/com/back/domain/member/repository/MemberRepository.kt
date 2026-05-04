package com.back.domain.member.repository

import com.back.domain.member.entity.Member
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface MemberRepository : JpaRepository<Member, Int> {

    fun findByUsername(username: String): Member?
    fun findByApiKey(apiKey: String): Member?
}
