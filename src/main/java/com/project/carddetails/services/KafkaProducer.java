package com.project.carddetails.services;

import com.project.carddetails.models.Payloads;

public interface KafkaProducer {

     void publishToQueue(String value, Payloads payloads);
}
