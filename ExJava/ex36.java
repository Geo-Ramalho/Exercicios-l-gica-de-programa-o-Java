package javaBasico;

import java.util.Scanner;

public class Exercicio36 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		int homem1, homem2,mulher3, mulher4,velho,novo,velha,nova,soma1,soma2;
		
		System.out.println("Somando as idades");
		
		System.out.println("Digite a idade do primeiro Homem:");
		homem1 = dados.nextInt();
		
		System.out.println("Digite a idadae do segundo Homem:");
		homem2 = dados.nextInt();
		
		System.out.println("Digite a idade da primeira Mulher:");
		mulher3 = dados.nextInt();
		
		System.out.println("Digite a idade da segunda Mulher:");
		mulher4 = dados.nextInt();
		
		
		if (homem1 > homem2) {
			velho = homem1;
			novo = homem2;
		}else {
			velho = homem2;
			novo = homem1;
		}
		
		if (mulher3 > mulher4){
		    velha = mulher3;
		    nova = mulher4;
		}else{
		    velha = mulher4;
		    nova = mulher3;
		}
		
		soma1 = velho+nova;
		soma2 = novo+velha;
		
		
		System.out.println("homem velho de "+velho+" e mulher nova de "+nova+" = "+soma1);
		System.out.println("homem novo de "+novo+" e mulher velha de "+velha+" = "+soma2);
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades dos homens serão sempre diferentes entre si, 
 * bem como as das mulheres). Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem 
 * mais novo com a mulher mais velha.
 */