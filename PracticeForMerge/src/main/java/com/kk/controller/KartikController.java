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

    @GetMapping
    public String changesByYogesh() {
        return "Chenges made by yogeshwar Please review and do needful if any Scrum Kartik Sir" ;
   
    }
}
