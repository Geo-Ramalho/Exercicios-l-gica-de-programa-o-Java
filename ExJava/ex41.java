package javaBasico;

import java.util.Scanner;

public class Exercicio41 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		float nota1, nota2, nota3, mediaAproveitamento, mediaExercicios;

		System.out.println("Qual é minha nota de conceito");

		System.out.println("Digite sua primeira nota: ");
		nota1 = dados.nextFloat();
		
		System.out.println("Digite sua segunda nota: ");
		nota2 = dados.nextFloat();
		
		System.out.println("Digite sua terceira nota: ");
		nota3 = dados.nextFloat();
		
		System.out.println("Digite a média de exercícios: ");
		mediaExercicios = dados.nextFloat();
		
		mediaAproveitamento = (nota1+2*nota2+3*nota3+mediaExercicios)/7;

		if (mediaAproveitamento >= 9){
			System.out.println("Sua nota final de conceito é: A");
		}

		if ((mediaAproveitamento >= 7.5) && (mediaAproveitamento < 9)){
			System.out.println("Sua nota final de conceito é: B");
		} 

		if ((mediaAproveitamento >= 6) && (mediaAproveitamento < 7.5)) {
			System.out.println("Sua nota final de conceito é: C");
		} 

		if (mediaAproveitamento < 6){
			System.out.println("Sua nota final de conceito é: D");
		}
		
		dados.close();
	}

}
