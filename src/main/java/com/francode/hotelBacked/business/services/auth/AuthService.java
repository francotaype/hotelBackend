package com.francode.hotelBacked.business.services.auth;

import com.francode.hotelBacked.presentation.dto.auth.JwtResponse;
import com.francode.hotelBacked.presentation.dto.auth.LoginRequest;
import com.francode.hotelBacked.presentation.dto.auth.SignupRequest;

public interface AuthService {
    boolean existsByEmail(String email);
    void registerUser(SignupRequest signUpRequest);
    JwtResponse authenticateUser(LoginRequest loginRequest);
}
