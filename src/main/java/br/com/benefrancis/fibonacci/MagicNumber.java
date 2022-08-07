package br.com.benefrancis.fibonacci;

import java.util.Scanner;

public class MagicNumber {
	int n;

	public MagicNumber(int n) {
		super();
		this.n = n;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de fibonacci que deseja calcular: ");

		int qtd = sc.nextInt();

		MagicNumber mn = new MagicNumber(qtd);

		long[] fibo = new long[mn.getN() + 1];

		double[] numeroMagico = new double[mn.getN() + 1];

		String fazendo = "";

		for (int i = 1; i < fibo.length; i++) {
			fibo[i] = new FibonacciRecursiveOtimizated(i).calculate(i);
		}

		System.out.println();
		
		for (long l : fibo) {
			System.out.print(l + " ");
		}
		
		System.out.println("\n\nO número mágico é obtido pela divisão do número posterior pelo número anterior da sequência de fibonacci. \nEste número vai se tornando cada vez mais exato (1,618) na medida em que os números vão crescendo. \nVeja: ");
		
		for (int i = 1; i < fibo.length - 1; i++) {
			numeroMagico[i] = ((double) fibo[i + 1] / (double) fibo[i]);
			fazendo = fibo[i + 1] + " : " + fibo[i] + " = " + String.format("%.20f", numeroMagico[i]);
			System.out.println(fazendo);
		}


 
		
		sc.close();
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

}
