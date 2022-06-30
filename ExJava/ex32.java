package javaBasico;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Quem é o vencedor desse partida de futebol");
		
		System.out.println("Digite o nome do primeiro time: ");
		String time1 = dados.next();
		
		System.out.println("Digite o número de gols marcados: ");
		int gols1 = dados.nextInt();
		
		System.out.println("Digite o nome do segundo time: ");
		String time2 = dados.next();
		
		System.out.println("Digite o número de gols marcados: ");
		int gols2 = dados.nextInt();
		
		
		if(gols1 > gols2) {
			System.out.println("O vencedor dessa partida é "+time1+" com: "+gols1+" gols");
		}else if (gols2 > gols1) {
			System.out.println("O vencedor dessa partida é "+time2+" com: "+gols2+" gols");
		}else {
			System.out.println("EMPATE!");
		}
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome do vencedor. 
 * Caso não haja vencedor deverá ser impressa. */