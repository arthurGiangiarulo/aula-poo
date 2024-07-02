package com.poo.aula;

import java.time.LocalDate;

public class Aluno {
    private static int contador = 10000;

    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private int matricula;

    public Aluno(String nome, LocalDate dtNasc) {
        this.nome = nome;
        this.dataNascimento = dtNasc;
        this.matricula = contador;
        contador++;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }    

    public static int getContador() {
        return contador;
    }

}
