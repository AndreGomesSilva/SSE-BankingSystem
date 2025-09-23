package com.banksse.controllers;

import com.banksse.model.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class LoginController {

    private final LoginProcessor loginProcessor;
    private static Logger logger = Logger.getLogger(LoginController.class.getName());

    public LoginController(LoginProcessor loginProcessor){
        this.loginProcessor = loginProcessor;
    }

    @GetMapping("/login")
    public String loginGet(){
       return "login.html";
    }

    @PostMapping("/login")
    public String loginPost(@RequestParam String username, @RequestParam String password, Model model) {
        logger.log(Level.INFO, "Loggin controller was called");

        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);
        boolean loggedIn = loginProcessor.login();

        if (loggedIn) {
            return "redirect:/main";
        }else {
            model.addAttribute("message", "Login failed");
        }

        return "login.html";
    }
}
