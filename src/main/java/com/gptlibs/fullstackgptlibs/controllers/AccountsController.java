package com.gptlibs.fullstackgptlibs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/accounts")
public class AccountsController {

    @GetMapping("/login")
    public String showGameStory() {
        return "accounts/login";
    }

}
