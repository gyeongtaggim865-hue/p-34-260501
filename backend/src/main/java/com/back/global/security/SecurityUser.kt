package com.back.global.security

import lombok.Getter
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.User

@Getter
class SecurityUser(
    val id: Int,
    username: String,
    password: String,
    val nickname: String,
    authorities: Collection<GrantedAuthority>
) : User(username, password, authorities)
