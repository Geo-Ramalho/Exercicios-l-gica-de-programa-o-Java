package javaBasico;

import java.util.Scanner;

public class Exercicio37 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		float morango, maca, totalKg, desconto, total;
		
		System.out.println("Qual valor total da minha compra");
		
		System.out.println("Qual a quantidade em Kg de morango comprados:");
		morango = dados.nextFloat();
		
		System.out.println("Qual a quantidade em Kg de maças compradas:");
		maca = dados.nextFloat();
		
		totalKg = morango+maca;
		
		if (morango > 5) {
			morango = morango*2.20f;
		}else {
			morango = morango*2.50f;
		}
		
		if (maca > 5) {
			maca = maca*1.50f;
		}else {
			maca = maca*1.80f;
		}
		
		total = morango+maca;
		
		if ((totalKg > 8) || (total > 25)) {
			desconto = 10*total/100;
			total = total-desconto;
			System.out.printf("O valor total da compra é: R$ %.2f", total);
		}else {
			System.out.printf("O valor total da compra é: R$ %.2f", total);
		}
	
		dados.close();
	}

}
