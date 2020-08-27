package com.project.carddetails.services;

import com.project.carddetails.response.ApiResponse;

public interface VerifyCardService {


    ApiResponse VerifyBankCard(String cardNumber);
}
