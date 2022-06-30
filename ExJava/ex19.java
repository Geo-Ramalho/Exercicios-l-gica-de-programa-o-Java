package javaBasico;

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Qual número é maior");
		
		System.out.println("Digite um número: ");
		int valor1 = dados.nextInt();
		System.out.println("Digite um número: ");
		int valor2 = dados.nextInt();
		
		if (valor1 == valor2) {
			System.out.println("Digite números DIFERENTES!");
		}else if (valor1 > valor2) {
			System.out.println("O maior número é: "+valor1);
		}else {
			System.out.println("O maior número é: "+valor2);
		}
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript
/* Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. */