package com.poo.aula;

import java.util.Scanner;

public class Lista04 {

    double[] vendas = {125.50, 30.11, 50.00, 25.25, 67.35};

    String[] lista = {"Queijo", "Presunto", "Farofa", "Cajuína", "Guaraná Pureza"};
    double[] precos = {10.5, 4.25, 1.5, 10, 4.99};
    
    double ex1() {
        // Fechamento do dia do mercado
        double total = somaDoDia(vendas);

        System.out.println("O fechamento do dia é: R$" + String.format("%.2f",total));

        return total;
    }
    double somaDoDia(double[] lista){
        double resultado = 0;

        // Opção 1
        for (int i=0; i<= (lista.length-1); i++){
            resultado = resultado + lista[i];
        }
        // Opção 2
        // for(double item : lista){
        //     resultado = resultado + item;
        // }

        return resultado;
    }

    void ex2() {
        // Identificar a de menor e maior valor
        
        System.out.println("A maior venda foi: R$" + identificaNumeroMaior(vendas));
        System.out.println("A menor venda foi: R$" + identificaNumeroMenor(vendas));
    }
    double identificaNumeroMaior(double[] lista){
        double numeroMaior = 0;
        for(double item : lista) {
            if(item > numeroMaior) {
                numeroMaior = item;
            }
        }
        return numeroMaior;
    }
    double identificaNumeroMenor(double[] lista){
        double numeroMenor = 0;
        for(double item : lista) {
            if(item < numeroMenor) {
                numeroMenor = item;
            }
        }
        return numeroMenor;
    }

    void ex3() {
        // Ticket médio
        // Total das vendas / Quantidade de vendas
        // ex1 / vendas.lenght
        double ticketMedio;
        ticketMedio = ex1()/vendas.length;

        System.out.println("O ticket médio é: R$" + String.format("%.2f",ticketMedio)) ;
    }

    void ex4() {
        // Número pares da lista

        int[] lista = {3,5,6,7,8,10,22,55,110};

        for(int num : lista) {
            if( (num%2) == 0 ){
                System.out.print(num + " ");
            }
        }
    }

    void ex5() {
        // Lista de compras de mercado
        // Menu: Inserir ou ver lista
        boolean continua = true;
        int opcao;

        do {
            System.out.println("==== MENU ====");
            System.out.println("1 Adicionar item");
            System.out.println("2 Deletar item");
            System.out.println("3 Ver lista");
            System.out.println("4 Sair");

            Scanner sc = new Scanner(System.in);
            opcao = sc.nextInt();

            if(opcao == 1) {
                inserirItem();
            } else if (opcao == 2) {
                deletarItem();
            } else if (opcao == 3) {
                verListaPreco();
            } else if (opcao == 4) {
                System.out.println("Saindo...");
                continua = false;
            } else {
                System.out.println("Digite uma opção válida.");
            }
        } while (continua);
    }
    void verLista(){
        for(String item : lista) {
            System.out.println(item);
        }
    }
    void inserirItem() {

        String item;

        System.out.println("Digite o item:");
        Scanner sc = new Scanner(System.in);
        item = sc.nextLine();

        String[] listaNova = new String[lista.length + 1];

        // Loop pra alimentar com a antiga + o item novo
        for(int i=0; i<listaNova.length; i++){
            if(i == listaNova.length - 1){
                listaNova[i] = item;
            } else {
                listaNova[i] = lista[i];
            }
        }
        System.out.println(listaNova);
        lista = listaNova;
    }

    // Ex6
    void deletarItem() {
        int item;
        for(int i=0; i<lista.length; i++){
            System.out.println( (i+1) + ") " + lista[i]);
        }

        System.out.println("Qual item deseja remover?");
        Scanner sc = new Scanner(System.in);
        item = sc.nextInt();
        item--;    
        
        String[] listaNova = new String[lista.length - 1];

        // Loop pra criar uma nova lista sem o item deletado
        for(int i=0; i<listaNova.length; i++){
            if(i < item){
                listaNova[i] = lista[i];
            } else if (i > item) {
                listaNova[i-1] = lista[i];
            }
        }
        lista = listaNova;
    }

    //Ex7
    void verListaPreco() {
        for(int i=0; i<lista.length; i++){
            System.out.print( (i+1) + ") " + lista[i]);
            System.out.println( " - R$" + precos[i]);
        }
    }

    //Ex8
    // Ordenar em ordem crescente de preço

    void ex8() {
        String[] lista = {"Queijo", "Presunto", "Farofa", "Cajuína", "Guaraná Pureza"};
        double[] precos = {10.5, 4.25, 1.5, 10, 4.99};

        int[] ordem = new int[precos.length]; 
        // {2, 1, 4, 3, 0}
        double numMenor = 1.5;

        for(int i=0; i<ordem.length; i++) {
            for(int j=0; j<ordem.length; j++){
                if(precos[j] < numMenor){
                    ordem[i] = j;
                }
            }
        }
    }
}