package com.poo.aula;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public abstract class Conta {
    private static int contador = 1000;
    
    // Atributos
    protected int numeroConta;
    protected double saldo;
    protected Cliente titular;
    protected ArrayList<Operacao> extrato;
    
    // Construtores
    public Conta(String nome, String cpf) {
        this.titular = new Cliente(nome, cpf);
        this.saldo = 0.0;
        this.numeroConta = contador;
        this.extrato = new ArrayList<>();
        Operacao op = new Operacao("Abertura de conta");
        extrato.add(op);
        contador++;
    }

    // Getters and Setters
    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Conta.contador = contador;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public ArrayList<Operacao> getExtrato() {
        return extrato;
    }

    public void setExtrato(ArrayList<Operacao> extrato) {
        this.extrato = extrato;
    }

    // Métodos
    public void depositar(double deposito) {
        // saldo = saldo + deposito;
        saldo += deposito;
        Operacao op = new Operacao("Depósito");
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
            Operacao op = new Operacao("Saque");
            op.tipo = "Saque";
            op.valor = saque;
            op.saldoApos = saldo;
            extrato.add(op);
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Seu novo saldo é: " + saldo + "\n");
        }
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

    public abstract void transferir(double valor, Conta c);

}
