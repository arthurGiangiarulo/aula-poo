package com.poo.aula;

public class ContaCorrente extends Conta {

    private double tarifa = 1;

    public ContaCorrente(String nome, String cpf) {
        super(nome, cpf);
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public void transferir(double valor, Conta c) {
        this.sacar(valor);
        cobrarTarifa();
        c.depositar(valor);
    }

    public void cobrarTarifa() {
        saldo -= tarifa;
        Operacao op = new Operacao("Tarifa");
        op.tipo = "Tarifa";
        op.valor = tarifa;
        op.saldoApos = saldo;
        extrato.add(op);
    }
}
