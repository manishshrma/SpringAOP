package com.example.AOP.AOP;

import org.springframework.stereotype.Component;

@Component
public class Traingle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
