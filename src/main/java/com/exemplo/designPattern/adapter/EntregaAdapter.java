package com.exemplo.designPattern.adapter;

import com.exemplo.designPattern.service.EntregaStrategy;
import com.exemplo.designPattern.service.EntregaTerceirizada;
import org.springframework.stereotype.Service;

@Service("terceirizada")
public class EntregaAdapter implements EntregaStrategy {
    public final EntregaTerceirizada terceirizada;
    public EntregaAdapter() {
        this.terceirizada = new EntregaTerceirizada();
    }

    @Override
    public double calcular(double peso) {
        return terceirizada.calcualrValorEntrega(peso);
    }

    public String tipo() {
        return "Terceirizada";
    }
}
