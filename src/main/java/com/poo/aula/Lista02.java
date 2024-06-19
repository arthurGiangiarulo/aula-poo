package com.poo.aula;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Lista02 {

    void ex1() {
        // Par, ímpar ou 0

        // % resto da divisão

        int numeroDigitado;

        System.out.print("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        numeroDigitado = sc.nextInt();
        int resto = numeroDigitado % 2;

        if (numeroDigitado == 0) {
            System.out.println("O número digitado é 0");
        } else if (resto == 0) {
            System.out.println("O número digitado é par");
        } else {
            System.out.println("O número digitado é ímpar");
        }
    }

    void ex2() {
        // Recebe 2 números e identifica o maior

        int numero1;
        int numero2;

        System.out.print("Digite o primeiro número: ");
        Scanner sc = new Scanner(System.in);
        numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = sc.nextInt();

        // Processar a resposta

        if (numero1 > numero2) {
            System.out.println("O maior número é o: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é o: " + numero2);
        } else {
            System.out.println("Os números são iguais");
        }
    }

    void ex4() {
        // Pessoa maior de idade
        // Menor que 16 nao pode entrar
        // Entre 16 e 18 somente acompanhado

        int idade;

        System.out.print("Qual sua idade: ");
        Scanner sc = new Scanner(System.in);
        idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Pode entrar");
        } else if (idade < 18 && idade >= 16) {
            System.out.println("Somente acompanhado");
        } else {
            System.out.println("Não pode entrar");
        }
    }    

    void ex5() {
        // verificação de login e senha

        String login = "arthur@docente.senai.br";
        String senha = "123Abc";
        String loginDigitado;
        String senhaDigitada;

        System.out.println("==== Login ====");
        System.out.print("Login: ");
        Scanner sc = new Scanner(System.in);
        loginDigitado = sc.nextLine();

        System.out.print("Senha: ");
        senhaDigitada = sc.nextLine();

        if ( (login.equals(loginDigitado)) && (senha.equals(senhaDigitada))) {
            System.out.println("Bem vindo!");
        } else {
            // Qual foi o erro?
            // Verificação dos 2
            //     login != loginDigitado
            if ( !(login.equals(loginDigitado)) && !(senha.equals(senhaDigitada))) {
                System.out.println("Login e senha incorretos!");
            // Verificação da senha
            } else if ( !senha.equals(senhaDigitada) ) {
                System.out.println("Senha incorreta!");
            // Verificação do login
            } else {
                System.out.println("Login incorreto!");
            }
        }
    }
    void ex6() {
        // Notas de um aluno. Aprovado ou reprovado? Tem recuperação
    
        double nota1;
        double nota2;
        double maiorNota;
        double menorNota;
        double recuperação;
        double media;

        System.out.println("===== Boletim =====");
        System.out.print("Digite a primeira nota: ");
        Scanner sc = new Scanner(System.in);
        nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("Parabéns! Média: " + media);
        } else {
            System.out.println("Recuperação! Média: " + media);
            System.out.print("Digite a nota de recuperação: ");
            recuperação = sc.nextDouble();

            // Verificar a menor nota
            if (nota1 > nota2) {
                maiorNota = nota1;
                menorNota = nota2;
            } else {
                maiorNota = nota2;
                menorNota = nota1;
            }

            // Recalcular a média
            if (recuperação > menorNota) {
                media = (maiorNota + recuperação) / 2;
            }

            // Verificar aprovação
            if (media >= 6) {
                System.out.println("Parabéns! Média: " + media);
            } else {
                System.out.println("Reprovado. Média: " + media);
            }
        }
    }
}
