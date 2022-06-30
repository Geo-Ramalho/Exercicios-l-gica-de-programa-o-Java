package javaBasico;

import java.util.Scanner;

public class Exercicio42 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		int anoNascimento, anoEmpresa, idade, tempoTrabalho, codigo;
		String nome;
		
		System.out.println("Veja se está qualificado para aposentar");
		
		System.out.println("Digite seu nome:");
		nome = dados.next();
		
		System.out.println("Digite o número de empregado(código):");
		codigo = dados.nextInt();
		
		if (((nome != "max") || (nome != "Max")) && (codigo == 1234)) {
			System.out.println("Acesso Permitido");
			
			System.out.println("Digite o ano de seu nascimento:");
			anoNascimento = dados.nextInt();
			
			System.out.println("Digite o ano que entrou na empresa:");
			anoEmpresa = dados.nextInt();
			
			idade = 2022-anoNascimento;
			tempoTrabalho = 2022-anoEmpresa;
			
			if ((idade >= 65) || (tempoTrabalho >= 30)){
				System.out.println("Requerer aposentadoria");
			 }else if ((idade >= 60) && (tempoTrabalho >= 25)){				 
				 System.out.println("Requerer aposentadoria");
			 }else {
				 System.out.println("Não requerer");
			 }
			}else {
				System.out.println("Acesso Negado");
			}
		
		dados.close();
		
		
		}
	}
