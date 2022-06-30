package javaBasico;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem ? ");
		int anos = dados.nextInt();
		
		System.out.println("Quantos meses passou desde seu aniversario ? ");
		int meses = dados.nextInt();
		
		System.out.println("Quantos dias passou desde seu mesversario ? ");
		int dias = dados.nextInt();
		
		int diasDeVida = anos*365+meses*30+dias;
		System.out.println("Você tem "+diasDeVida+" dias de vida.");
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. 
 * Considerar ano com 365 dias e mês com 30 dias. */