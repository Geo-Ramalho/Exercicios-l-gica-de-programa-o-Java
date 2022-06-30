package javaBasico;

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Convertendo Fahrenheit em Celsius");
		
		System.out.println("Digite o valor em Fahrenheit: ");
		float F = dados.nextFloat();
		
		float C = (F-32)*5/9;
		
		System.out.println("O valor em Celsius é: "+C+"C");
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius 
 * (baseado na fórmula abaixo): C/5 = F-32/9  -- Observação: Para testar se a sua resposta está correta saiba que 100oC = 212F. */