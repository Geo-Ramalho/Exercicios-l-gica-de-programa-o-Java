package javaBasico;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		float desconto, total, porLitro;

		System.out.println("Qual valor total do combustível: ");

		System.out.println("Qual combustível G-gasolina ou A-álcool:");
		String combustivel = dados.next();

		System.out.println("Quantos litros foram vendidos:");
		int litros = dados.nextInt();

		if ((combustivel.equals("g")) || (combustivel.equals("G")) && (litros <= 20)) {
			porLitro = litros * 3.30f;
			desconto = porLitro * 0.04f;
			total = porLitro - desconto;
			System.out.println("O total a pagar é: R$" + total);
		} else if (litros > 20) {

			porLitro = litros * 3.30f;
			desconto = porLitro * 0.06f;
			total = porLitro - desconto;
			System.out.println("O total a pagar é: R$" + total);

		}

		if ((combustivel.equals("a")) || (combustivel.equals("G")) && (litros <= 20)) {

			porLitro = litros * 2.90f;
			desconto = porLitro * 0.03f;
			total = porLitro - desconto;
			System.out.println("O total a pagar é: R$" + total);
		} else if (litros > 20) {
			porLitro = litros * 2.90f;
			desconto = porLitro * 0.05f;
			total = porLitro - desconto;
			System.out.println("O total a pagar é: R$" + total);
		}

		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

//* Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.

//Álcool
//até 20 litros, desconto de 3% por litro 
//acima de 20 litros, desconto de 5% por litro

//Gasolina
//até 20 litros, desconto de 4% por litro 
//acima de 20 litros, desconto de 6% por litro 