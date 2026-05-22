package com.divyasphere.controller;

import com.divyasphere.dto.response.ApiResponse;
import com.divyasphere.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/health")
public class HealthController {

    @GetMapping
    public ApiResponse<String> healthCheck() {

        return ApiResponse.<String>builder()
                .success(true)
                .message("Application running successfully")
                .data("DivyaSphere backend is healthy")
                .build();
    }

    @GetMapping("/error")
    public String throwError() {

        throw new ResourceNotFoundException("Temple not found");
    }
}
