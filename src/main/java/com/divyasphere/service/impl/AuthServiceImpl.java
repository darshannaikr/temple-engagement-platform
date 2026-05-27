package com.divyasphere.service.impl;

import com.divyasphere.dto.request.SignupRequest;
import com.divyasphere.dto.response.ApiResponse;
import com.divyasphere.entity.User;
import com.divyasphere.repository.UserRepository;
import com.divyasphere.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public ApiResponse<String> signup(SignupRequest request) {

        if (userRepository.existsByEmail(request.getEmail())) {
           return ApiResponse.<String>builder()
                   .success(false)
                   .message("Email already exists")
                   .data(null).build();
        }

        User user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(request.getRole())
                .active(true)
                .build();

        userRepository.save(user);

        return ApiResponse.<String>builder()
                .success(true)
                .message("User registered successfully")
                .data(user.getEmail())
                .build();
    }
}
