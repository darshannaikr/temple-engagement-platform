package com.divyasphere.service.impl;

import com.divyasphere.constants.Role;
import com.divyasphere.dto.response.UserProfileResponse;
import com.divyasphere.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public UserProfileResponse getCurrentUser() {

        return UserProfileResponse.builder()
                .firstName("Test")
                .lastName("User")
                .email("test@test.com")
                .role(Role.valueOf("ADMIN"))
                .build();
    }
}
