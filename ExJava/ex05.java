package javaBasico;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int numero = dados.nextInt();
		
		int resultado = numero-1;
		System.out.println("O numero antecessor ao seu numero é:"+resultado);
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor. */