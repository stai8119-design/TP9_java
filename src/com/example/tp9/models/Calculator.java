package com.example.tp9.models;

public class Calculator {
    public double add(double x, double y) {
        return x + y;
    }

    public double divide(double x, double y) {
        if (y == 0.0) {
            throw new IllegalArgumentException("Division par zéro impossible.");
        }
        return x / y;
    }
}