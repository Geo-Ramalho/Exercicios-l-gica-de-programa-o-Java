package javaBasico;

import java.util.Scanner;

public class Exercicio13 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Calculando a média da nota final");
		
		System.out.println("Digite a primeira nota: ");
		float nota1 = dados.nextFloat();
		System.out.println("Digite a segunda nota: ");
		float nota2 = dados.nextFloat();
		System.out.println("Digite a terceira nota: ");
		float nota3 = dados.nextFloat();
		
		float mediaFinal = (nota1*2+nota2*3+nota3*5)/10;
		
		System.out.println("A média da nota final é: "+mediaFinal);
		
		dados.close();
	} 
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno. Considerar que a média é ponderada e que o peso das 
 * notas é 2, 3 e 5. Fórmula para o cálculo da média final é:   mediafinal = n1*2 + n2*3 + n3*5 / 10. */