package javaBasico;

import java.util.Scanner;

public class Exercicio34 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Fazendo teste de mesa.");
		
		System.out.println("Digite um número: ");
		int x = dados.nextInt();
		
		System.out.println("Digite um número: ");
		int y = dados.nextInt();
		
		int z = x*y+5;
		String resposta;
		
		if (z <= 0) {
			resposta = "A";
		}else if (z <= 100) {
			resposta = "B";
		}else {
			resposta = "C";
		}
		
		System.out.println(z+resposta);
		
		dados.close();
	}
}