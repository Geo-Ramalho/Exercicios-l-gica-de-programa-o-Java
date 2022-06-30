package javaBasico;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = dados.nextInt();
		
		System.out.println("Digite um numero: ");
		int numero2 = dados.nextInt();
		
		int subtracao=numero-numero2;
		System.out.println("O somatório dos numeros é: "+subtracao);
		
		dados.close();
	}
}