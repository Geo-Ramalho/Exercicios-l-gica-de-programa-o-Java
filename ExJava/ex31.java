package javaBasico;

import java.util.Scanner;

public class Exercicio31 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("É possível ou não formar um triângulo");
		
		System.out.println("Digite um número: ");
		int A = dados.nextInt();
		
		System.out.println("Digite outro número: ");
		int B = dados.nextInt();
		
		System.out.println("Digite mais um número: ");
		int C = dados.nextInt();
		
		
		if ((A < B+C) && (B < A+C) && (C < A+B)) {
			System.out.println("É possível formar um triângulo");
		}else {
			System.out.println("Não é possível formar um triângulo");
		};
	
		
		dados.close();
	}
	
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo. OBS: para formar um triângulo, 
 * o valor de cada lado deve ser menor que a soma dos outros 2 lados. */ 
