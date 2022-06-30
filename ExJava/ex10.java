package javaBasico;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite o valor de fábrica: R$");
		float fabrica = dados.nextFloat();
		
		float distribuidor = 28*fabrica/100;
		float imposto = 45*fabrica/100;
		float consumidor = distribuidor+imposto+fabrica;
		
		System.out.println("+ Impostos: R$"+imposto+"\n+ Distribuidor: R$"+distribuidor+"\n\nValor Final: R$"+consumidor);
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
 * Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e 
 * escrever o custo final ao consumidor. */