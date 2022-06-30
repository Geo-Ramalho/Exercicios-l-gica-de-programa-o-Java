package javaBasico;

import java.util.Scanner;

public class Exercicio24 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Calculando seu salário + comissão");
		
		System.out.println("Digite seu salário fixo: ");
		float salarioFixo = dados.nextFloat();
		
		System.out.println("Digite o valor de vendas efetuadas: ");
		float vendas = dados.nextFloat();
		
		if (vendas > 1500) {
			float salarioAtual = vendas*(5/100)+salarioFixo;
			System.out.println("Seu salário atual é: "+salarioAtual);
		}else {
			float salarioAtual = vendas*(3/100)+salarioFixo;
			System.out.println("Seu salário atual é: "+salarioAtual);
		}
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas 
 * até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total. */