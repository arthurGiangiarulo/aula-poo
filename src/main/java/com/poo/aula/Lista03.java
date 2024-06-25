package com.poo.aula;

import java.util.Scanner;

public class Lista03 {
    void ex1 () {
        // Cronômetro. Entre 1 e 59.

        int num;
        boolean respostaErrada = true;

        // Verificando a resposta do usuário
        do {
            System.out.println("Defina o tempo do cronômetro em segundos: ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
    
            if (num >=1 && num <=59) {
                System.out.println("Ok! Começando a contar...");
                respostaErrada = false;
            } else {
                System.out.println("Número inválido!");
            }
            sc.close();

        } while ( respostaErrada );

        for (int i = num; i >= 0; i--) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    void ex2() {
        // Tabuada

        int num;

        System.out.println("======= TABUADA =======");
        System.out.print("Informe um número inteiro: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i=1; i<=9; i++) {
            int res = num * i;
            System.out.println(num + " x " + i + " = " + res);
        }
    }

    void ex3() {
        // Os números pares entre os números informados

        int num1;
        int num2;

        System.out.print("Informe um número inteiro: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();

        System.out.print("Informe outro número inteiro: ");
        num2 = sc.nextInt();

        for (int i=(num1+1); i<num2; i++) {
            if ( (i%2) == 0 ) {
                System.out.println(i);
            }
        }
    }

    // void ex5() {
    //     // verificação de login e senha

    //     String login = "arthur@docente.senai.br";
    //     String senha = "123Abc";
    //     String loginDigitado;
    //     String senhaDigitada;
    //     int tentativas = 3;
    //     boolean respostaErrada = true;
        
    //     do {
    //         System.out.println("==== Login ====");
    //         System.out.print("Login: ");
    //         Scanner sc = new Scanner(System.in);
    //         loginDigitado = sc.nextLine();
    
    //         System.out.print("Senha: ");
    //         //Verifica a senha
    //         if ( (login.equals(loginDigitado)) && (senha.equals(senhaDigitada))) {
    //             System.out.println("Bem vindo!");
    //             respostaErrada = false;
    //         } else {
    //             tentativas--;
    //             // Qual foi o erro?
    //             // Verificação dos 2
    //             //     login != loginDigitado
    //             if ( !(login.equals(loginDigitado)) && !(senha.equals(senhaDigitada))) {
    //                 System.out.println("Login e senha incorretos!");
    //             // Verificação da senha
    //             } else if ( !senha.equals(senhaDigitada) ) {
    //                 System.out.println("Senha incorreta!");
    //             // Verificação do login
    //             } else {
    //                 System.out.println("Login incorreto!");
    //             }

    //             if (tentativas == 0){
    //                 System.out.println("Senha bloqueada!");
    //             } else {
    //                 System.out.println(tentativas + " tentativas restantes");
    //             }
    //         }
    //     } while (tentativas > 0 && respostaErrada);
    // }

    void ex6() {
        // Piramide de asteriscos

        //     *
        //    *** 
        //   *****
        //  *******  

        int andares;

        System.out.println("Quantos andares?");
        Scanner sc = new Scanner(System.in);
        andares = sc.nextInt();

        // Loop que imprime => 2++
        // Loop que pula de linha (andares)

        for (int i=1; i<=andares; i++) {
            // imprime os espaços
            for(int k=1; k<=(andares-i); k++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void ex7() {
        // Retangulo

        // ********
        // ********
        // ********

        int largura;
        int altura;

        System.out.println("Qual largura do retangulo?");
        Scanner sc = new Scanner(System.in);
        largura = sc.nextInt();

        System.out.println("Qual altura do retangulo?");
        altura = sc.nextInt();

        for (int i=0; i<altura; i++) {
            for (int j=0; j<largura; j++) {
                System.out.print("*");
            }
            System.out.println();
        }  
    }
}
