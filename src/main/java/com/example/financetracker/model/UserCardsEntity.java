package com.example.financetracker.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_cards")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserCardsEntity {
    @Id
    private Long card_name;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private FinanceUserEntity financeUser;
}
