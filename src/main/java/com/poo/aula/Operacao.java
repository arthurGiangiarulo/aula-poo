package com.poo.aula;

import java.time.*;

public class Operacao {
    String tipo;
    double valor;
    LocalDateTime horario;
    double saldoApos;

    public Operacao(String tipo) {
        this.tipo = tipo;
        this.valor = 0;
        this.horario = LocalDateTime.now();
        this.saldoApos = 0;
    }
}
