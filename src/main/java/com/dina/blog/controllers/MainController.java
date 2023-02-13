package com.dina.blog.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public String home( Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
    @GetMapping("/login")
    public String login( Model model) {
        model.addAttribute("title", "Главная страница");
        return "login";
    }
    @GetMapping("/add")
    public String add( Model model) {
        return "add";
    }

    @PostMapping("/add2")
    public String add2(Model model){
        return "add2";
    }

}

