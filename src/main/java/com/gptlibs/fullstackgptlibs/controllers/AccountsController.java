package com.gptlibs.fullstackgptlibs.controllers;

import com.gptlibs.fullstackgptlibs.repositories.MadLibRepo;
import com.gptlibs.fullstackgptlibs.repositories.UserRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/accounts")
public class AccountsController {

    MadLibRepo madLibsDAO;
    UserRepo usersDAO;

    public AccountsController(MadLibRepo madlibDAO, UserRepo userDAO) {
        this.madLibsDAO = madlibDAO;
        this.usersDAO = userDAO;
    }

    @GetMapping("/login")
    public String showGameStory() {
        return "accounts/login";
    }

}
