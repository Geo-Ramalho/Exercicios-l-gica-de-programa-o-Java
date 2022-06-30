package javaBasico;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da base do seu retangulo em cm:");
		int base = dados.nextInt();

		System.out.println("Digite o tamanho da altura do seu retangulo em cm:");
		int altura = dados.nextInt();
		
		int area = base*altura;
		System.out.println("O tamanho da area do seu retangulo é:"+area+"cm²");
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo. */