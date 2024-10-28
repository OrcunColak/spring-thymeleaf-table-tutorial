package com.colak.springtutorial.controller.account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class AccountController {

    // http://localhost:8080/accounts
    @GetMapping("/accounts")
    public String getAllAccounts(Model model) {
        List<Account> accounts = List.of(
                new Account("John", "ACTIVE"),
                new Account("Jane", "INACTIVE"),
                new Account("Bob", "SUSPENDED")
        );
        model.addAttribute("accounts", accounts);
        return "account-list";
    }
}
