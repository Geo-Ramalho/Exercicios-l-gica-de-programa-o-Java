package javaBasico;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Calculando o salário final do vendedor");
		
		System.out.println("Digite a quantidade de carros vendidos por você: ");
		float quantidadeCarroVendido = dados.nextFloat();
		
		System.out.println("Digite o valor total de suas vendas: ");
		float totalVendas = dados.nextFloat();
		
		System.out.println("Digite o seu salário fixo: ");
		float salarioFixo = dados.nextFloat();
		
		System.out.println("Digite o valor recebido por cada carro vendido: ");
		float valorCarroVendido = dados.nextFloat();
		
		float comissaoFixa = quantidadeCarroVendido*valorCarroVendido;
		float comissaoVariavel = totalVendas*5/100;
		float salarioFinal = salarioFixo+comissaoFixa+comissaoVariavel;
		
		System.out.println("O salário final corresponde á: R$"+salarioFinal);
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e 
 * mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas, o 
 * salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor. */