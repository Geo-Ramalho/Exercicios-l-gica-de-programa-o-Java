package javaBasico;

import java.util.Scanner;

public class Exercicio28 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Ler 3 valores e escrever o maior deles");
		
		System.out.println("Digite um número: ");
		int numero1 = dados.nextInt();
		
		System.out.println("Digite outro número: ");
		int numero2 = dados.nextInt();
		
		System.out.println("Digite mais um número: ");
		int numero3 = dados.nextInt();
		
		if ((numero1 == numero2) || (numero1 == numero3) || (numero2 == numero3)) {
			System.out.println("Digite número diferentes!");
			
		}else if ((numero1 > numero2) && (numero1 > numero3)) {
			System.out.println("O número maior é: "+numero1);
			
		}else if ((numero2 > numero1) && (numero2 > numero3)) {		
			System.out.println("O número maior é: "+numero2);
			
		}else {
			System.out.println("O número maior é: "+numero3);
		}
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. */