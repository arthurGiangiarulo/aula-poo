package com.poo.aula;

import java.util.Scanner;

import com.poo.aula.exceptions.DivisaoPorZero;

public class Classe2 {

    // Throws Exception
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
