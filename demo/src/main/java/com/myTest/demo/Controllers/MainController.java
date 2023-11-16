package com.myTest.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "");
        return "home";
    }
    @GetMapping("/calculate")
    public String calculate(Model model) {
        model.addAttribute("test", "калькулятор");
        return "calculate";
    }


}