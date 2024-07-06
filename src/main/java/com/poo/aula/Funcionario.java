package com.poo.aula;

public class Funcionario extends Pessoa {

    private String ctps;

    public Funcionario(String nome, String cpf, String ctps, Endereco endereco) {
        super(nome, cpf);
        this.ctps = ctps;
        this.endereco = endereco;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }
 
}