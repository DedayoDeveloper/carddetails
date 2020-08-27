package com.project.carddetails.controllers;

import com.project.carddetails.models.CardDetails;
import com.project.carddetails.models.Payloads;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping
    public String index(Model model){
        model.addAttribute("carddetails", new CardDetails());
        return "index";
    }


    @PostMapping("/details")
    public String processCardDetails(@ModelAttribute CardDetails details){
        logger.info("carddetails == {} " , details.getValue());
        return null;
    }


}
