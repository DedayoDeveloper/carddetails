package com.project.carddetails.services.implementations;

import com.project.carddetails.models.Payloads;
import com.project.carddetails.services.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerImpl implements KafkaProducer {

    @Autowired
    private KafkaTemplate<String, Payloads> kafkaTemplate;

    @Value("${cloudkarafka.topic}")
    private String topic;

    @Override
    public void publishToQueue(String value, Payloads payloads){
        kafkaTemplate.send(topic,value,payloads);
    }
}
