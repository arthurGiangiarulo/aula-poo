package com.poo.aula;

import java.util.Scanner;

public class Lista01 {

    public void ex1(){
        int num1;
        int num2;
        int res;
        
        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        num2 = sc.nextInt();

        res = num1 + num2;

        System.out.println("A soma dos números é: " + res);
    }

    void ex2() {
        // Pergunte nome e sobrenome e imprima na tela

        String nome;
        String sobrenome;

        System.out.print("Digite seu nome: ");
        Scanner sc = new Scanner(System.in);
        nome = sc.next();

        System.out.print("Digite seu sobrenome: ");
        sobrenome = sc.next();

        System.out.println("Olá, " + nome + " " + sobrenome);
    }

    void ex3() {
        // Conversor de moerda R$ para $ (5.25)
        
        System.out.print("Digite o valor em reais (R$): ");
        Scanner s = new Scanner(System.in);
        double reais = s.nextDouble();

        System.out.print(
            "R$" + 
            String.format("%.2f", reais) + 
            " convertidos em dólar equivalem a: $" + 
            String.format("%.2f", (reais/5.25)) 
        );
    }

    void ex4() {
        // antecessor e sucessor

        System.out.print("Digite um número e descubra seu antecessor e sucessor: ");
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado = scanner.nextInt();

        System.out.println(
            "O antecessor de " + 
            numeroDigitado +
            " é " +
            (numeroDigitado - 1) +
            " e seu sucessor é " +
            (numeroDigitado + 1)
        );
    }

    void ex5() {
        // Calcular valor de terreno baseado na área

        // dimensoes => área
        // valor do m2

        int largura;
        int comprimento;
        int area;
        double valorM2;

        System.out.println("==== Calculadora de Terreno ====");
        System.out.println("\nInforme as dimensões do terreno");

        System.out.print("Largura: ");
        Scanner scInt = new Scanner(System.in);
        largura = scInt.nextInt();

        System.out.print("Comprimento: ");
        comprimento = scInt.nextInt();

        area = (largura * comprimento);

        System.out.print("Valor do m2: R$");
        Scanner scDouble = new Scanner(System.in);
        valorM2 = scDouble.nextDouble();

        scDouble.close();
        scInt.close();

        System.out.println("O valor do total do terreno é R$" + String.format("%.2f", (valorM2 * area)) );
    }

    void ex6() {
        // 
    }
}