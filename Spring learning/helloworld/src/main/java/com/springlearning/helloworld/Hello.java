package com.springlearning.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/create")
public String hello(){
        return "HEllo World From bridgelabz";
    }
}
