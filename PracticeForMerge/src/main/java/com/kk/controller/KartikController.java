package com.kk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class KartikController {

    @GetMapping
    public String sayName(){
        return "I am Kartik Kadam";
    }

    @GetMapping("/address")
    public String sayAddress(){
        return "< NANDED | MAHARASHTRA | INDIA | ASIA | EARTH >";
    }
}
