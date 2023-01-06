package com.example.cicdtest;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
    
}
