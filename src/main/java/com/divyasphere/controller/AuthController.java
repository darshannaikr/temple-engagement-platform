package com.divyasphere.controller;

import com.divyasphere.dto.request.SignupRequest;
import com.divyasphere.dto.response.ApiResponse;
import com.divyasphere.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ApiResponse<String> signup(@Valid @RequestBody SignupRequest request){
        return authService.signup(request);
    }
}
