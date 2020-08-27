package com.project.carddetails.response;

import com.project.carddetails.models.Payloads;

import java.util.List;

public class VerifyCardResponse {

    private boolean success;
    private Payloads payloads;


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Payloads getPayloads() {
        return payloads;
    }

    public void setPayloads(Payloads payloads) {
        this.payloads = payloads;
    }
}
