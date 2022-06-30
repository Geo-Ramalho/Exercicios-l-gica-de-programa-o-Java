package javaBasico;

import java.util.Scanner;

public class Exercicio25 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Mostrar se o saldo na conta é positivo");
		
		System.out.println("Digite o número da sua conta: ");
		float conta = dados.nextFloat();
		
		System.out.println("Digite o valor do saldo: ");
		float saldo = dados.nextFloat();
		
		System.out.println("Digite o valor do débito: ");
		float debito = dados.nextFloat();
		
		System.out.println("Digite o valor do crédito: ");
		float credito = dados.nextFloat();
		
		float saldoAtual = saldo-debito+credito;
		
		if (saldoAtual >= 0) {
			System.out.println("Sua conta: "+conta);
			System.out.println("Saldo Positivo");
		}else {
			System.out.println("Sua conta: "+conta);
			System.out.println("Saldo Negativo");
		}
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). 
 * Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. */