package com.learning.usermanagementbackend.mapper;

import com.learning.usermanagementbackend.dto.UserRequest;
import com.learning.usermanagementbackend.dto.UserResponse;
import com.learning.usermanagementbackend.entity.Role;
import com.learning.usermanagementbackend.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserResponse mapToResponse(User user) {
        return new UserResponse(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getRole().name(),
                user.isActive(),
                user.getCreatedAt().toString()
        );
    }

    public User mapToUser(UserRequest request){
        User user = new User();
        user.setName(request.name());
        user.setEmail(request.email());
        user.setPassword(request.password());
        user.setRole(Role.valueOf(request.role().toUpperCase()));
        user.setActive(true);
        return user;

    }
}
