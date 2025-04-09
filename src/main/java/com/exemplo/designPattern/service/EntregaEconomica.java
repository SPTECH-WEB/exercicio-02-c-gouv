package com.exemplo.designPattern.service;

import org.springframework.stereotype.Service;

@Service
public class EntregaEconomica implements EntregaStrategy {
    public double calcular(double peso) {
        return (peso * 1.05) + 5;
    }

    public String tipo() {
        return "Economica";
    }
}
