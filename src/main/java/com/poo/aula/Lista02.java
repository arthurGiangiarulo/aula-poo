package com.poo.aula;

import java.util.Scanner;

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

    
}
