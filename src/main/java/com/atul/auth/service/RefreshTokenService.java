package com.atul.auth.service;

import com.atul.auth.model.RefreshToken;

public interface RefreshTokenService {
    RefreshToken createRefreshToken(int userId);
    RefreshToken findByToken(String token) throws Exception;
    RefreshToken validateRefreshTokenExpiry(RefreshToken refreshToken);
}
