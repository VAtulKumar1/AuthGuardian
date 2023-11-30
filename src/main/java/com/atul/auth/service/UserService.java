package com.atul.auth.service;

import com.atul.auth.dto.UserDto;
import com.atul.auth.request.ChangePasswordRequest;
import com.atul.auth.request.LoginRequest;
import com.atul.auth.request.RefreshTokenRequest;
import com.atul.auth.request.RegisterRequest;
import com.atul.auth.response.AuthenticationResponse;
import com.atul.auth.response.RefreshTokenReponse;

import java.security.Principal;
import java.util.List;

public interface UserService {

    void registerUser(RegisterRequest registerRequest);

    AuthenticationResponse loginUser(LoginRequest loginRequest) throws Exception;

    RefreshTokenReponse refreshToken(RefreshTokenRequest refreshTokenRequest) throws Exception;

    UserDto getUserById(int id);

    List<UserDto> getAllUsers();

    UserDto changePassword(ChangePasswordRequest request, Principal connectedUser);
}
