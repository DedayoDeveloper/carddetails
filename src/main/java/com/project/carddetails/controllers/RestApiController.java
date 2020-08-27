package com.project.carddetails.controllers;

import com.project.carddetails.models.Payloads;
import com.project.carddetails.response.ApiResponse;
import com.project.carddetails.response.VerifyCardResponse;
import com.project.carddetails.services.VerifyCardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestApiController {

    @Autowired
    private VerifyCardService verifyCardService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/card-scheme/verify/{cardnumber}")
    public VerifyCardResponse verifyCardDetails(@PathVariable Long cardnumber, Payloads payloads, VerifyCardResponse card){
        ApiResponse JsonResponse = verifyCardService.VerifyBankCard(cardnumber);
        payloads.setScheme(JsonResponse.getScheme());
        payloads.setType(JsonResponse.getType());
        payloads.setBank(JsonResponse.getBank().getName());
        card.setSuccess(true);
        card.setPayloads(payloads);
        return card;
    }

}
