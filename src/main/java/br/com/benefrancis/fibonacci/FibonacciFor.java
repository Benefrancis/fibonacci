package br.com.benefrancis.fibonacci;

import java.util.Scanner;

public class FibonacciFor {

	public static long calculate(int qtd) {

		long inicio = System.currentTimeMillis();

		long atual = 0;
		long anterior = 0;
		String resposta = "";

		for (int i = 1; i <= qtd; i++) {

			if (i == 1) {
				atual = 1;
				anterior = 0;
			} else {
				atual += anterior;
				anterior = atual - anterior;
			}
			resposta += atual + " ";
		}

		System.out.print(resposta);

		long fim = System.currentTimeMillis();
		long duracao = fim - inicio;

		System.out.println("\r\nEste processamento levou: " + duracao + " ms para ser concluído.");

		System.out.println("*****************************************************************");
		return atual;
	}

	public static void main(String[] args) {
		int qtd;

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de fibonacci que deseja calcular: ");

		qtd = sc.nextInt();

		calculate(qtd);

		sc.close();

	}

}
