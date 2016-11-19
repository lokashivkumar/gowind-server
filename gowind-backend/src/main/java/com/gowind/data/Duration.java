package com.gowind.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Duration {
    public String text;
    public int value;

    public Duration() {
    }

    public Duration(String text, int value) {
        this.text = text;
        this.value = value;
    }
}
