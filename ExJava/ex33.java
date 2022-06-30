package javaBasico;

import java.util.Scanner;

public class Exercicio33 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Qual é o maior desses número?");
		
		System.out.println("Digite um número: ");
		int numero1 = dados.nextInt();
		
		System.out.println("Digite um número: ");
		int numero2 = dados.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("O maior número é: "+numero1);
		}else if (numero2 > numero1) {
			System.out.println("O maior número é: "+numero2);
		}else {
			System.out.println("Os números são IGUAIS!");
		};
		
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/*  Ler dois valores e imprimir uma das três mensagens a seguir:
 * 
 * ‘Números iguais’, caso os números sejam iguais
 * ‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
 * ‘Segundo maior’, caso o segundo seja maior que o primeiro. */