package com.exemplo.designPattern.controller;

import com.exemplo.designPattern.service.EntregaService;
import com.exemplo.designPattern.service.EntregaStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entregas")
public class EntregaController {
    private final EntregaService entregaService;
    public EntregaController(EntregaService entregaService) {
        this.entregaService = entregaService;
    }

    @GetMapping
    public String calcularEntrega(@RequestParam String tipo, @RequestParam double peso) {
        double valor = entregaService.calcular(tipo, peso);
        return "O valor da entrega é de R$%.2f".formatted(valor);
    }
}