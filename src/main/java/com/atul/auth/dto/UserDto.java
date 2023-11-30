package com.atul.auth.dto;

import com.atul.auth.model.Role;
import lombok.Data;

@Data
public class UserDto {
    private int id;
    private String userName;
    private String email;
    private String password;
    private Role role;
}
