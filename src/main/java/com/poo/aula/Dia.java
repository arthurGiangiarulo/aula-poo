package com.poo.aula;

import java.time.LocalDate;

public class Dia {

    public static String qualDia() {
        LocalDate hoje = LocalDate.now();
        int numeroDoDia = hoje.getDayOfWeek().getValue();

        DiaDaSemana diaDaSemana = DiaDaSemana.fromNumero(numeroDoDia);
        
        return diaDaSemana.getNomePorExtenso();
    }

}
