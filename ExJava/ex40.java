package javaBasico;

import java.util.Scanner;

public class Exercicio40 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		float quantidade, precoUnidade, total, totalPagar, desconto; 
		String produto;
		
		System.out.println("Qual o total de compra");
		
		System.out.println("Digite o nome do produto:");
		produto = dados.next();
		
		System.out.println("Digite a quantidade:");
		quantidade = dados.nextInt();
		
		System.out.println("Digite o preço da unidade:");
		precoUnidade = dados.nextInt();
		
		total = quantidade*precoUnidade;
		
		if (quantidade <= 5) {
			desconto = quantidade*0.02f;
			totalPagar = total-desconto;
			System.out.println("Produtos:"+produto);
			System.out.println("O total a pagar é: R$"+totalPagar);
		}
		
		if ((quantidade > 5) && (quantidade <= 10)) {
			desconto = quantidade*0.03f;
			totalPagar = total-desconto;
			System.out.println("Produtos:"+produto);
			System.out.println("O total a pagar é: R$"+totalPagar);
		}
		
		if 	(quantidade > 10) {
			desconto = quantidade*0.05f;
			totalPagar = total-desconto;
			System.out.println("Produtos:"+produto);
			System.out.println("O total a pagar é: R$"+totalPagar);
		}
		
		
		dados.close();
	}

}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. Calcular e escrever o total 
 * (total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que:
 * - Se quantidade <= 5 o desconto será de 2%
 * - Se quantidade > 5 e quantidade <=10 o desconto será de 3%
 * - Se quantidade > 10 o desconto será de 5%
*/