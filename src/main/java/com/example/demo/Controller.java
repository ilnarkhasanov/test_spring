package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @CrossOrigin("*")
    @GetMapping("/kek")
    public String index() {
        return "fe";
    }

}
