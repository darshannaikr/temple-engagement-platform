package com.divyasphere.controller;

import com.divyasphere.dto.response.ApiResponse;
import com.divyasphere.dto.response.UserProfileResponse;
import com.divyasphere.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/me")
    public ApiResponse<UserProfileResponse> getCurrentUser() {

        return ApiResponse.success(
                userService.getCurrentUser()
        );
    }
}
