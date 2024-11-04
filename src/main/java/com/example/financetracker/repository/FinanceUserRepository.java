package com.example.financetracker.repository;

import com.example.financetracker.model.FinanceUserEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FinanceUserRepository {
    Optional<FinanceUserEntity> findByUsername(String username);
}
