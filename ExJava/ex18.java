package javaBasico;

import java.util.Scanner;

public class Exercicio18 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Você pode votar na eleição esse ano?");
		
		System.out.println("Digite o ano que nasceu: ");
		int dataNascimento = dados.nextInt();
		
		System.out.println("Digite o ano atual: ");
		int anoAtual = dados.nextInt();
		
		int eleitor = anoAtual-dataNascimento;
		
		if (eleitor > 16) {
			System.out.println("Você tem "+eleitor+" anos, então pode votar na eleição");
		}else {
			System.out.println("Você tem "+eleitor+" anos, então não pode votar na eleição");
		}
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano 
 * (não é necessário considerar o mês em que a pessoa nasceu). */