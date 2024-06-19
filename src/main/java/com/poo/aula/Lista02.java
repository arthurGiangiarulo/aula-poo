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
}
