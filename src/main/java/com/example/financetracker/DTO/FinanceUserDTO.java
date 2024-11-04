package com.example.financetracker.DTO;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class FinanceUserDTO {
    private Long user_id;
    private String user_Name;
    private String email;
    private List<String> cards;
}
