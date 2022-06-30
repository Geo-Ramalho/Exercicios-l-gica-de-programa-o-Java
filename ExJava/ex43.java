package javaBasico;

import java.util.Scanner;

public class Exercicio43 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		int a, b, c; 
		String mens;
		
		System.out.println("TESTE DE MESA (agora o código quebra!)");
		
		System.out.println("Digite um número para A:");
		a = dados.nextInt();
		
		System.out.println("Digite um número para B:");
		b = dados.nextInt();
		
		System.out.println("Digite um número para C:");
		c = dados.nextInt();
		
		
		
		if ((a < b + c) && (b < a + c) && (c < a + b)){
			 if ((a == b) && (b == c)){
			     mens = "Triângulo Equilátero";
			 }else 
				 if ((a == b) || (b == c) || (a == c)){
			     mens = "Triângulo Isósceles";
			 }else{
			     mens = "Triângulo Escaleno";
			 }
		}else{
			mens = "Não é possível formar um triângulo";
		}
		System.out.println("Resultado: "+mens);
		
		dados.close();
	}
}

	