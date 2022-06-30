package javaBasico;

import java.util.Scanner;

public class Exercicio27 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Ler um valor e escrever se o número é positivo, negativo ou zero");
		
		System.out.println("Digite um número: ");
		float numero = dados.nextFloat();
		
		if (numero == 0) {
			System.out.println("Esse número é zero");
		}else if (numero > 0) {
			System.out.println("Esse número é positivo");
		}else {
			System.out.println("Esse número é negativo");
		}
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Ler um valor e escrever se é positivo, negativo ou zero. */