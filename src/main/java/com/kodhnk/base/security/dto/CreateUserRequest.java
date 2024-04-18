package com.kodhnk.base.security.dto;

import com.kodhnk.base.entities.enums.Role;
import lombok.Builder;

@Builder
public record CreateUserRequest(
        String firstname,
        String lastname,
        String email,
        String username,
        String password,
        Role authorities
) {
}