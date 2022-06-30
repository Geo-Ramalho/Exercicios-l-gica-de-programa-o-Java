package javaBasico;

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("O número é POSITIVO ou NEGATIVO!");
		
		System.out.println("Digite um número: ");
		int numero = dados.nextInt();
		
		if (numero >= 0) {
			System.out.println("É POSITIVO");
		}else {
			System.out.println("É NEGATIVO");
		}
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). */