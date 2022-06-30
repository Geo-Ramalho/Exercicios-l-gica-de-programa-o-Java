package javaBasico;

import java.util.Scanner;

public class Exercicio14 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("O número é MAIOR QUE 10!");
		
		System.out.println("Digite um número: ");
		int numero = dados.nextInt();
		
		if (numero > 10) {
			System.out.println("É MAIOR QUE 10!");
		}else {
			System.out.println("NÃO É MAIOR QUE 10!");
		}
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10! */