package com.poo.aula;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pessoa {
    // Atributos
    String nome;
    String cpf;
    LocalDate dataNascimento;
    int idade;
    LocalDate criadoEm;
    Pessoa criadoPor;

    // Construtores
    public Pessoa(String cpf, String nome){
        setCpf(cpf);
        this.nome = nome;
        this.criadoEm = LocalDate.now();
    }
    public Pessoa(){
        
    }

    //Métodos
    void imprimeDetalhes() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("--- Dados da Pessoa ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento.format(formatter));
        System.out.println("Idade: " + idade);
        System.out.println("-----------------------");
    }
    void alterarAtributos(){
        System.out.println("Digite o novo nome: ");
        Scanner sc = new Scanner(System.in);
        nome = sc.nextLine();
        System.out.println("Cadastro alterado com sucesso");
    }
    public void setCpf(String cpf) {
        // Validações
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        // Validações
        this.nome = nome;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
