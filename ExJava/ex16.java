package javaBasico;

import java.util.Scanner;

public class Exercicio16 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Qual o custo total das maças?");
		
		System.out.println("Digite a quantidade de maças compradas: ");
		float macas = dados.nextFloat();
		
		float cal1 = macas*1.30f;
		float cal2 = macas*1;
		
		if (macas > 12) {
			System.out.println("O total é: R$"+cal1);
		}else {
			System.out.println("O total é: R$"+cal2);
		}
		
		dados.close();
	}

}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12. Escreva um programa que leia o 
 * número de maçãs compradas, calcule e escreva o custo total da compra. */