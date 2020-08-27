package com.project.carddetails.models;

public class CardDetails {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CardDetails{" +
                "value='" + value + '\'' +
                '}';
    }
}
