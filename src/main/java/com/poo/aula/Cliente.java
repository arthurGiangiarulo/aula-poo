package com.poo.aula;

public class Cliente extends Pessoa implements Autentica{
    
    public Cliente (String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public boolean autentica(String loginDigitado, String senhaDigitada) {
        return getLogin().equalsIgnoreCase(loginDigitado) && getSenha().equals(senhaDigitada);
    }
}
