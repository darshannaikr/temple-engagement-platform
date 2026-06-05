package com.divyasphere.dto.response;

import com.divyasphere.constants.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserProfileResponse {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Role role;
}
