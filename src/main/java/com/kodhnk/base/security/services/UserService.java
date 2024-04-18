package com.kodhnk.base.security.services;

import com.kodhnk.base.dataAccess.UserRepository;
import com.kodhnk.base.entities.User;
import com.kodhnk.base.security.dto.CreateUserRequest;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByEmail(username);
        return user.orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
    }

    public User createUser(CreateUserRequest request) {

        User newUser = User.builder()
                .firstname(request.firstname())
                .lastname(request.lastname())
                .username(request.username())
                .email(request.email())
                .password(passwordEncoder.encode(request.password()))
                .role(request.authorities())
                .build();
        return userRepository.save(newUser);
    }
}