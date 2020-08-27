package com.project.carddetails.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.carddetails.models.Payloads;
import org.apache.kafka.common.protocol.Message;
import org.apache.kafka.common.serialization.Serializer;

public class MessageSerializer implements Serializer<Payloads> {

    @Override
    public byte[] serialize(String s, Payloads data) {
        byte[] serializedValue = null;
        ObjectMapper om = new ObjectMapper();
        if(data != null) {
            try {
                serializedValue = om.writeValueAsString(data).getBytes();
            } catch (JsonProcessingException e) {
            }
        }
        return serializedValue;
    }
}
