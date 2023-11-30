package com.atul.auth.request;

import lombok.Data;

@Data
public class RefreshTokenRequest {
    private String token;
    private String refreshToken;
    private String tokenType="Bearer ";
}
