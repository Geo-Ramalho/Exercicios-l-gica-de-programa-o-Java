package javaBasico;

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		float nota1 = dados.nextFloat();
		
		System.out.println("Digite sua segunda nota: ");
		float nota2 = dados.nextFloat();
		
		float media = (nota1+nota2)/2;
		
		if (media >= 6) {
			System.out.println("Você foi APROVADO!");
		}else {
			System.out.println("Você foi REPROVADO!");
		}
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado 
 * (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada. */