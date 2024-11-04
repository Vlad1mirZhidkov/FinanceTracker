package com.example.financetracker.service;

import com.example.financetracker.model.FinanceUserEntity;
import com.example.financetracker.repository.FinanceUserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class FinanceUserService {
    private final FinanceUserRepository financeUserRepository;
    public FinanceUserEntity getByUsername(String username) {
        return financeUserRepository.findByUsername(username)
                .orElseThrow(() -> new IllegalArgumentException("User with username " + username + " not found."));
    }

    public FinanceUserEntity registerUser(RegisterUserRequest request) {
        return ;
    }
}
