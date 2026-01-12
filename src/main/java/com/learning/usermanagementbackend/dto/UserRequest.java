package com.learning.usermanagementbackend.dto;

public record UserRequest(
        String name,
        String email,
        String password,
        String role
) {
}
