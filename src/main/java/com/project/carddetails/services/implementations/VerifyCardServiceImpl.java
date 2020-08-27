package com.project.carddetails.services.implementations;

import com.project.carddetails.models.Bank;
import com.project.carddetails.response.ApiResponse;
import com.project.carddetails.response.VerifyCardResponse;
import com.project.carddetails.services.VerifyCardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class VerifyCardServiceImpl implements VerifyCardService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RestTemplate template;


    @Override
    public ApiResponse VerifyBankCard(long cardNumber){
        String url = "https://lookup.binlist.net/"+cardNumber;
        ApiResponse JsonResponse = template.getForObject(url,ApiResponse.class);
        logger.info("apiResponse {}", JsonResponse);
        return JsonResponse;
    }



}
