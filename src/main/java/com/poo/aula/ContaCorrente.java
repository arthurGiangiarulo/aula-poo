package com.poo.aula;

import java.util.ArrayList;

public class ContaCorrente {
    
    // Atributos
    int numeroConta;
    double saldo;
    Cliente titular;
    ArrayList<Operacao> extrato = new ArrayList<>();

    // Métodos
    void depositar(double deposito) {
        // saldo = saldo + deposito;
        saldo += deposito;
        Operacao op = new Operacao();
        op.tipo = "Depósito";
        op.valor = deposito;
        op.saldoApos = saldo;
        extrato.add(op);
        System.out.println("Depósito efetuado com sucesso");
        System.out.println("Seu novo saldo é: " + saldo + "\n");
    }

    void sacar(double saque) {
        // Verificar se tem saldo suficiente
        if (saque > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= saque;
            Operacao op = new Operacao();
            op.tipo = "Saque";
            op.valor = saque;
            op.saldoApos = saldo;
            extrato.add(op);
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Seu novo saldo é: " + saldo + "\n");
        }
    }

    void saldo() {
        System.out.println("Seu saldo é: " + saldo + "\n");
    }

    void extrato() {
        for(Operacao op : extrato){
            System.out.println("Operação: " + op.tipo);
            System.out.println("Valor: " + op.valor);
            System.out.println("Horário: " + op.horario);
            System.out.println("Saldo: " + op.saldoApos + "\n");
        }
    }
}
