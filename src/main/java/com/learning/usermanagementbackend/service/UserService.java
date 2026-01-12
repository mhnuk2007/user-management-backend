package com.learning.usermanagementbackend.service;

import com.learning.usermanagementbackend.dto.UserResponse;
import com.learning.usermanagementbackend.entity.User;
import com.learning.usermanagementbackend.mapper.UserMapper;
import com.learning.usermanagementbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;


    public List<UserResponse> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::mapToResponse)
                .toList();

    }
}
