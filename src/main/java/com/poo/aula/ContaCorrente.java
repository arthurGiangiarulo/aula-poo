package com.poo.aula;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ContaCorrente {
    
    // Atributos
    private int numeroConta;
    private double saldo;
    Cliente titular = new Cliente();
    private ArrayList<Operacao> extrato = new ArrayList<>();

    // Métodos
    public void depositar(double deposito) {
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

    public void sacar(double saque) {
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

    public void transferir(double valor, ContaCorrente cc){
        // De quam chama pra quem eu recebo de parâmetro
        this.sacar(valor);
        cc.depositar(valor);
    }

    public void saldo() {
        // Lógica que pedisse a senha do cartão
        // System.out.println("O saldo de " + titular.getNome() + " é: " + saldo + "\n");
    }

    public void extrato() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss ");
        for(Operacao op : extrato){
            System.out.println("_________________________");
            System.out.println("Operação: " + op.tipo);
            System.out.println("Valor: " + op.valor);
            System.out.println("Horário: " + op.horario.format(formatador));
            System.out.println("Saldo: " + op.saldoApos + "\n");
        }
    }
}
