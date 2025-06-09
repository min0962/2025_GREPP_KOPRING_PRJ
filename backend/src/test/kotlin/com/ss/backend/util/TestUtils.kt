package com.ss.backend.util

import com.ss.backend.domain.Member
import com.ss.backend.dto.Role

fun genMember(targetName: String, targetEmail: String) =
    Member(null, targetName, targetEmail, Role.GOLD)