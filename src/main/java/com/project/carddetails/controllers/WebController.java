package com.project.carddetails.controllers;

import com.project.carddetails.models.CardDetails;
import com.project.carddetails.models.Payloads;
import com.project.carddetails.response.ApiResponse;
import com.project.carddetails.services.VerifyCardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    @Autowired
    private VerifyCardService verifyCardService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping
    public String index(Model model){
        model.addAttribute("carddetails", new CardDetails());
        model.addAttribute("apiresponse", new ApiResponse());
        return "index";
    }


    @PostMapping("/details")
    public String processCardDetails(@ModelAttribute CardDetails cardDetails, Model model){
        ApiResponse response = verifyCardService.VerifyBankCard(cardDetails.getValue());
        model.addAttribute("apiresponse", response);
        model.addAttribute("carddetails", cardDetails);
        model.addAttribute("bankname", response.getBank().getName());
        model.addAttribute("country", response.getCountry().getName());
        return "index";
    }


}
