package com.jalbornoz.springsecurity.service;

import com.jalbornoz.springsecurity.controller.models.AuthResponse;
import com.jalbornoz.springsecurity.controller.models.AuthenticationRequest;
import com.jalbornoz.springsecurity.controller.models.RegisterRequest;

public interface AuthService {
    AuthResponse register (RegisterRequest request);
    AuthResponse authenticate (AuthenticationRequest request);
}
