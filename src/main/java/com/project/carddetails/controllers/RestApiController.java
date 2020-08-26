package com.project.carddetails.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    @GetMapping("/details")
    public String index(){
        return "HELLO TEST";
    }

}
