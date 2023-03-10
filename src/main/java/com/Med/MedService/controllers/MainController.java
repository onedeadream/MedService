package com.Med.MedService.controllers;

import com.Med.MedService.repository.UserRepository;
import com.Med.MedService.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private com.Med.MedService.repository.UserRepository UserRepository;

    @GetMapping("/")
    public String first( Model model) {
        return "homePage";
    }

}
