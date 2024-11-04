package com.example.financetracker.model;

import com.example.financetracker.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "finance_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FinanceUserEntity {
    @Id
    private Long user_id;

    private String username;

    private String email;

    @ElementCollection
    @CollectionTable(name = "user_cards", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "card_name")
    private List<String> cards;

    private Role role;

    // Write more fields
}
