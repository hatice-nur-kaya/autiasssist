package com.kodhnk.base.security.dto;

public record AuthRequest (
        String username,
        String password
){
}