
package javaBasico;

import java.util.Scanner;

public class Exercicio21 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Duração da partida de Xadrez");
		
		System.out.println("Digite a hora que 'começou' a partida de Xadrez: ");
		float horaInicial = dados.nextFloat();
		System.out.println("Digite a hora que 'terminou' a partida de Xadrez: ");
		float horaFinal = dados.nextFloat();
		
		float horaTotal1 = horaFinal-horaInicial;
		
		if (horaTotal1 > 0) {
			System.out.println("A partida de Xadrez durou: "+horaTotal1+"horas");
		}else {
			float horaTotal2 = horaTotal1+24;
			System.out.println("A partida de Xadrez durou: "+horaTotal2+"horas");
		}
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se 
 * que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. */