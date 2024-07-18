package com.poo.aula;

import java.util.Scanner;

public class Classe1 {

    public static void repeteRecursivo() {
        System.out.println("Repete? s/n");
            Scanner sc = new Scanner(System.in);
            String resposta = sc.nextLine();
            if(resposta.equals("s")) {
                repeteRecursivo();
            }
    }

    public static void repeteLoop() {
        
        boolean repete = true;
        while(repete) {
            System.out.println("Repete? s/n");
            Scanner sc = new Scanner(System.in);
            String resposta = sc.nextLine();
            if(resposta.equals("n")) {
                repete = false;
            }
        }
    }

}
