package br.com.benefrancis.fibonacci;

import java.util.Scanner;

public class FibonacciRecursiveOtimizated {

	int n;
	long[] cache;

	public FibonacciRecursiveOtimizated(int n) {
		super();
		this.n = n;
		this.cache = new long[this.n + 1];
	}

	public long calculate(int qtd) {
	// @formatter:off
		if (qtd <= 1) return qtd;
	
		if (cache[qtd] != 0) return cache[qtd];

		long resultado = calculate(qtd - 1) + calculate(qtd - 2);
		cache[qtd] = resultado;
	return resultado;
	// @formatter:on
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de fibonacci que deseja calcular: ");

		int qtd = sc.nextInt();

		FibonacciRecursiveOtimizated fibo = new FibonacciRecursiveOtimizated(0);

		long inicio;
		long fim;
		long duracao;
		inicio = System.currentTimeMillis();
		for (int i = 1; i <= qtd; i++) {
			System.out.print(fibo.calculate(i) + " ");
		}
		fim = System.currentTimeMillis();
		duracao = fim - inicio;

		System.out.println("\r\nEste processamento levou: " + duracao + " ms para ser concluído.");

		sc.close();
	}

}
