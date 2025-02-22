package com.springlearning.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello_MVC {
    @GetMapping("/hello")
    public String helloweb(Model model){
        model.addAttribute("message","This is custom message");
        return "message";
    }
}
