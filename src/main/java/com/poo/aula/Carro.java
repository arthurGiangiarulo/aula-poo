package com.poo.aula;

public class Carro {

    String fabricante;
    String modelo;
    int ano;
    String cor;
    String proprietário;
    String placa;
    String chassi;
    double valor;

    double calculaIPVA() {
        return this.valor * 0.04;
    }
}
