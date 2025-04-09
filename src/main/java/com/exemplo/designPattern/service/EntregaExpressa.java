package com.exemplo.designPattern.service;

import org.springframework.stereotype.Service;

@Service
public class EntregaExpressa implements EntregaStrategy {
    public double calcular(double peso) {
        return (peso * 1.20) + 10;
    }

    public String tipo() {
        return "Expressa";
    }
}
