
		
		System.out.println("Digite outro número: ");
		int valor2 = dados.nextInt();
		
		System.out.println("Digite mais um número: ");
		int valor3 = dados.nextInt();
		
		if ((valor1 == valor2) || (valor1 == valor3) || (valor2 == valor3)) {
			System.out.println("Digite números diferentes");
		}else if ((valor1 > valor2) && (valor1 > valor3)) {
			int cal = valor1+valor2;
			System.out.println("O número maior é: "+cal);
		}else if ((valor2 > valor1) && (valor2 > valor3)) {
			int cal = valor2+valor1;
			System.out.println("O número maior é: "+cal);
		}else {
			int cal = valor3+valor2;
			System.out.println("O número maior é: "+cal);
		}
		
		dados.close();
	}
}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores. */