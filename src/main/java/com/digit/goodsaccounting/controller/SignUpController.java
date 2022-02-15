package com.digit.goodsaccounting.controller;

import com.digit.goodsaccounting.form.SignUpForm;
import com.digit.goodsaccounting.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @GetMapping("/signUp")
    public String getSignUpPage(Model model, Authentication authentication) {

        if (authentication != null) {
            List<String> auth = authentication.getAuthorities().stream().map(String::valueOf).collect(Collectors.toList());
            if (auth.get(0).equals("ADMIN")) {
                return "redirect:/admin/items";
            }
            if (auth.get(0).equals("USER")) {
                return "redirect:/items";
            }
        }
        model.addAttribute("signUpForm", new SignUpForm());
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUpUser(SignUpForm form, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("signUpForm", form);
            return "signUp";
        }
        signUpService.signUp(form);
        return "redirect:/signIn";
    }
}
