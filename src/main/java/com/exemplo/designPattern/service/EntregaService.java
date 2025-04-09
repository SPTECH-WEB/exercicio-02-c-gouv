package com.exemplo.designPattern.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregaService {
    private final List<EntregaStrategy> estrategias;
    public EntregaService(List<EntregaStrategy> estrategias) {
        this.estrategias = estrategias;
    }

    public double calcular(String tipo, double peso){
        return estrategias.stream()
                .filter(e -> tipo.equalsIgnoreCase(e.tipo()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Tipo de Frete Inválido"))
                .calcular(peso);
    }
}