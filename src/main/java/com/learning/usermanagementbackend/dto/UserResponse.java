package com.learning.usermanagementbackend.dto;

public record UserResponse(
        Long id,
        String name,
        String email,
        String role,
        boolean active,
        String createdAt
) {
}
