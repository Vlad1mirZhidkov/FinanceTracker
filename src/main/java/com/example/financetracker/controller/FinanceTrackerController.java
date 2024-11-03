package com.example.financetracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FinanceTrackerController {
    @GetMapping()
    public String index() {
        return "index";
    }
}
