package com.jalbornoz.springsecurity.service;

import com.jalbornoz.springsecurity.config.JwtService;
import com.jalbornoz.springsecurity.controller.models.AuthResponse;
import com.jalbornoz.springsecurity.controller.models.AuthenticationRequest;
import com.jalbornoz.springsecurity.controller.models.RegisterRequest;
import com.jalbornoz.springsecurity.entity.Role;
import com.jalbornoz.springsecurity.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;


    @Override
    public AuthResponse register(RegisterRequest request) {
        var user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword))
                .role(Role.USER)
                .build();
        userRepository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthResponse.builder()
                .token(jwtToken).build();
    }

    @Override
    public AuthResponse authenticate(AuthenticationRequest request) {
        return null;
    }
}
