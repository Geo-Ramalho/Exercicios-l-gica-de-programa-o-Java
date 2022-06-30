package javaBasico;

import java.util.Scanner;

public class Exercicio23 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Calculando seu peso ideal");
		
		System.out.println("Digite seu nome: ");
		String nome = dados.next();
		
		System.out.println("Digite sua altura: ");
		float altura = dados.nextInt();
		
		System.out.println("Digite seu sexo: ");
		String sexo = dados.next();
		
		if (sexo == "m") {
			float peso = 72.7f*altura-58;
			System.out.println(nome+" - Seu peso ideal é: "+peso);
		}else if (sexo == "f") {
			float peso = 62.1f*altura-44.7f;
			System.out.println(nome+" - Seu peso ideal é: "+peso);
		}
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Para o enunciado a seguir foi elaborado um algoritmo em Português Estruturado que contém erros, identifique os erros no algoritmo 
 * apresentado abaixo: Enunciado: Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule e mostre seu 
 * peso ideal, utilizando as seguintes fórmulas: - para sexo masculino: peso ideal = (72.7 * altura) - 58 - para sexo feminino: peso 
 * ideal = (62.1 * altura) - 44.7. */