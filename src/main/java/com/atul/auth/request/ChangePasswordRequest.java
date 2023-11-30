package com.atul.auth.request;

import lombok.Data;

@Data
public class ChangePasswordRequest {
    private int id;
    private String password;
}
