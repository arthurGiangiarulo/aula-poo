package com.poo.aula;

// public enum DiaDaSemana {

//     // Declarando um ENUM simples
//     SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;

// }

public enum DiaDaSemana {
    SEGUNDA(1, "Segunda-feira"),
    TERCA(2, "Terça-feira"),
    QUARTA(3, "Quarta-feira"),
    QUINTA(4, "Quinta-feira"),
    SEXTA(5, "Sexta-feira"),
    SABADO(6, "Sábado"),
    DOMINGO(7, "Domingo");
    
    private final int numero;
    private final String nomePorExtenso;
    
    DiaDaSemana(int numero, String nomePorExtenso) {
        this.numero = numero;
        this.nomePorExtenso = nomePorExtenso;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public String getNomePorExtenso() {
        return nomePorExtenso;
    }
    
    public static DiaDaSemana fromNumero(int numero) {
        for (DiaDaSemana dia : DiaDaSemana.values()) {
            if (dia.getNumero() == numero) {
                return dia;
            }
        }
        throw new IllegalArgumentException("Número do dia da semana inválido: " + numero);
    }
}
