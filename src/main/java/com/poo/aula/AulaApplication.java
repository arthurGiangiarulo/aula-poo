package com.poo.aula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);

		limpa_mac_linux();

		Lista04 lista = new Lista04();
		lista.ex5();

        // Exemplos ex = new Exemplos();
        // ex.ex02();

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
