package com.example.AOP.AOP;

import org.springframework.stereotype.Component;

@Component
public class Circle {
    private String name="circle obj";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
