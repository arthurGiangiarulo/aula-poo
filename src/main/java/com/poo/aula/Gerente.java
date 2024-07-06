package com.poo.aula;

public class Gerente extends Funcionario implements Autentica {

    public Gerente(String nome, String cpf, String ctps, Endereco endereco) {
        super(nome, cpf, ctps, endereco);
    }

    @Override
    public boolean autentica(String loginDigitado, String senhaDigitada) {
        return getLogin().equalsIgnoreCase(loginDigitado) && getSenha().equals(senhaDigitada);
    }

}
