package com.example.financetracker.controller;

import com.example.financetracker.model.FinanceUserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FinanceTrackerController {
    @GetMapping()
    public String index() {
        return "index";
    }

    @GetMapping("/admin-panel")
    public String adminPanel() {
        return "admin_panel";
    }

    @PostMapping("/admin-panel")
    public String adminPanelPost() {
        return "admin_panel";
    }
}