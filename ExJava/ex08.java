package javaBasico;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[] args) {
	
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Quantos votos validos tivemos nessa eleição ? ");
		int validos = dados.nextInt();
		
		System.out.println("Quantos votos brancos tivemos nessa eleição ? ");
		int brancos = dados.nextInt();
		
		System.out.println("Quantos votos nulos tivemos nessa eleição ? ");
		int nulos = dados.nextInt();
		
		int total = nulos+brancos+validos;
		int pVotosValidos = validos*100/total;
		int pVotosBrancos = brancos*100/total;
		int pVotosNulos = nulos*100/total;
		
		System.out.println("A porcentagem de votos validos foi de "+pVotosValidos+"%");
		System.out.println("A porcentagem de votos brancos foi de "+pVotosBrancos+"%");
		System.out.println("A porcentagem de votos nulos foi de "+pVotosNulos+"%");
		
		dados.close();
	}

}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o 
 * percentual que cada um representa em relação ao total de eleitores. */