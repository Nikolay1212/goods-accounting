package com.digit.goodsaccounting.controller;

import com.digit.goodsaccounting.model.Account;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class SignInController {

    @GetMapping("/signIn")
    public String getSignInPage(Authentication authentication) {

        if (authentication != null) {
            List<String> auth = authentication.getAuthorities().stream().map(String::valueOf).collect(Collectors.toList());
            if (auth.get(0).equals("ADMIN")) {
                return "redirect:/admin/items";
            }
            if (auth.get(0).equals("USER")) {
                return "redirect:/items";
            }
        }
        return "signIn";
    }
}
