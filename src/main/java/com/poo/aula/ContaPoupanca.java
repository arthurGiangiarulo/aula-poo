package com.poo.aula;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void transferir(double valor, Conta c) {
        this.sacar(valor);
        c.depositar(valor);
    }
}
