package javaBasico;

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		 System.out.println("Calculando o reajuste do salário atual");
		 
		 System.out.println("Digite o valor do seu salário atual: ");
		 float salario = dados.nextFloat();
		 
		 System.out.println("Digite a porcentagem do reajuste: ");
		 float reajuste = dados.nextFloat();
		 
		
		 float resultado = reajuste/100*salario;
		 float novoSalario = resultado+salario;
		 
		 System.out.println("O salário com o reajuste é: "+novoSalario);
		 
		 dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário. */
