package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController {
    @RequestMapping("/loadform")
    public String loadFormPage() {
        return "logintemplate";

    }

    @RequestMapping("/processform")
    public String loadFoamPage(@RequestParam("Login Credentials") String login, Model model) {
        model.addAttribute("loginval", login );
        return "granted";
    }
}
