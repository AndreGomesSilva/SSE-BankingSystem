package com.banksse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class HomeController {

    //http parameter
//    @RequestMapping("/")
//    public String home(@RequestParam(required = false) String name,
//                       @RequestParam(required = false) String color, Model page) {
//        page.addAttribute("username", name);
//        page.addAttribute("color", color);
//        return "home.html";
//    }

    //path variable
    @RequestMapping("/home/{color}")
    public String home(@PathVariable  String color, Model page) {
        page.addAttribute("username", "Andre");
        page.addAttribute("color", color);
        return "home.html";
    }

}
