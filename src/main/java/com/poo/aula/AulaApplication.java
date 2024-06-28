package com.poo.aula;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);

		limpa_mac_linux();

		// Pessoa antonio = new Pessoa();
        // antonio.nome = "Antônio";
        // antonio.cpf = "123456789-00";
        // antonio.dataNascimento = LocalDate.of(2014,1,1);
        // antonio.idade = 20;
        // antonio.criadoEm = LocalDate.of(2024,06,27);

        // antonio.imprimeDetalhes();
        // antonio.alterarAtributos();
        // antonio.imprimeDetalhes();

        // ContaCorrente contaDoYuri = new ContaCorrente();
        // contaDoYuri.titular.nome = "Yuri";
        // contaDoYuri.depositar(1000);
        // contaDoYuri.sacar(850);
        // contaDoYuri.extrato();
        // contaDoYuri.saldo();
        // ContaCorrente contaDoLucas = new ContaCorrente();
        // contaDoLucas.titular.nome = "Lucas";
        // contaDoLucas.saldo();
        // contaDoYuri.transferir(100, contaDoLucas);
        // contaDoYuri.saldo();
        // contaDoLucas.saldo();

        // Cliente lucas = new Cliente();
        // lucas.nome = "Lucas";
        // lucas.setNome("Lucas");
        // System.out.println(lucas.getNome());


		finaliza();
	}

	static void limpa_mac_linux() {
		try {
            if (System.getProperty("os.name").contains("Linux") || System.getProperty("os.name").contains("Mac")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            } else {
                System.out.println("Este comando só funciona no Linux ou Mac.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	static void limpa_windows() {
		try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.println("Este comando só funciona no Windows.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	static void finaliza() {
		System.out.println("\n\n\n\n");
	}
}
