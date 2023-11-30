package com.atul.auth.controller;


import com.atul.auth.response.RefreshTokenReponse;
import com.atul.auth.service.RefreshTokenService;
import com.atul.auth.request.LoginRequest;
import com.atul.auth.request.RefreshTokenRequest;
import com.atul.auth.request.RegisterRequest;
import com.atul.auth.response.AuthenticationResponse;
import com.atul.auth.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final UserService userService;
    private final RefreshTokenService refreshTokenService;

    public AuthController(UserService userService, RefreshTokenService refreshTokenService) {
        this.userService = userService;
        this.refreshTokenService = refreshTokenService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody RegisterRequest registerRequest){

           userService.registerUser(registerRequest);
           return ResponseEntity.ok("User Registered Successfully");


    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> loginUser(@RequestBody LoginRequest loginRequest) throws Exception {
        AuthenticationResponse authenticationResponse= userService.loginUser(loginRequest);
        return ResponseEntity.ok(authenticationResponse);

    }

    @PostMapping("/refreshToken")
    public ResponseEntity<RefreshTokenReponse> refreshToken(@RequestBody RefreshTokenRequest refreshTokenRequest) throws Exception {

        RefreshTokenReponse refreshTokenReponse=null;
        try {
            refreshTokenReponse = userService.refreshToken(refreshTokenRequest);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.ok(refreshTokenReponse);
    }


}
