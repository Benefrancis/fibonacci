package br.com.benefrancis.fibonacci;

import java.util.Scanner;

public class FibonacciRecursiveImature {

	public static long calculate(int qtd) {

	// @formatter:off
	if(qtd<=1) return qtd;
	
	return calculate(qtd - 1) + calculate(qtd - 2);
	// @formatter:on

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de fibonacci que deseja calcular: ");

		int qtd = sc.nextInt();

		long inicio = System.currentTimeMillis();
		for (int i = 1; i <= qtd; i++) {
			System.out.print(calculate(i) + " ");
		}
		long fim = System.currentTimeMillis();
		long duracao = fim - inicio;

		System.out.println("\r\nEste processamento levou: " + duracao + " ms para ser concluído.");

		System.out.println("*****************************************************************");
		
		sc.close();
	}

}
