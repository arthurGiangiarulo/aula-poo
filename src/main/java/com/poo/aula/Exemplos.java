package com.poo.aula;

import java.util.Scanner;

public class Exemplos {

    void ex1() throws InterruptedException {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }

    }

    void ex02() {
        int tempo;
        boolean certo = false;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("digite um valor entre 1 e 59:");
            tempo = scanner.nextInt();
    
            if (tempo > 0 && tempo <= 59){
                certo = true;
            }else {
                System.out.println("Valor invalido");
            }

        } while (certo);


        for (int i = tempo; i > 0; i--) {
            
            System.out.println(i);
        }
    }

}
