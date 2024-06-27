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
    LocalDate criadoEm = LocalDate.now();
    Pessoa criadoPor;

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
}
