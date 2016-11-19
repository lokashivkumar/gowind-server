package com.gowind.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Distance {
    public String text;
    public int value;

    public Distance() {
    }

    public Distance(String text, int value) {
        this.text = text;
        this.value = value;
    }
}