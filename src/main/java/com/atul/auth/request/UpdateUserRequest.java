package com.atul.auth.request;

import com.atul.auth.model.Role;
import lombok.Data;

@Data
public class UpdateUserRequest {
    private int id;
    private String userName;
    private String email;
    private Role role;
}
