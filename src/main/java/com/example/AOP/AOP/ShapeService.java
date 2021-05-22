package com.example.AOP.AOP;

import org.springframework.stereotype.Service;

@Service
public class ShapeService {
    private Circle circle;
    private Traingle traingle;

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Traingle getTraingle() {
        return traingle;
    }

    public void setTraingle(Traingle traingle) {
        this.traingle = traingle;
    }
}
