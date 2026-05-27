package com.divyasphere.service;

import com.divyasphere.dto.request.SignupRequest;
import com.divyasphere.dto.response.ApiResponse;

public interface AuthService {

    ApiResponse<String> signup(SignupRequest request);
}
