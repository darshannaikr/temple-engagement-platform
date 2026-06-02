package com.divyasphere.service;

import com.divyasphere.dto.request.LoginRequest;
import com.divyasphere.dto.request.SignupRequest;
import com.divyasphere.dto.response.ApiResponse;
import com.divyasphere.dto.response.AuthResponse;

public interface AuthService {

    ApiResponse<String> signup(SignupRequest request);

    ApiResponse<AuthResponse> login(LoginRequest request);
}
