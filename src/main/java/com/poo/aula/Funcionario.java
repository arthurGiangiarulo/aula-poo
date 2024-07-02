package com.poo.aula;

public class Funcionario {
    String nome;
    String cpf;
    double salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public double inss() {
        return salario * 0.11;
    }
    public double ir() {
        return salario * 0.275;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
