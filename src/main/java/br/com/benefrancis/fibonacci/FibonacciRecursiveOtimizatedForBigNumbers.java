package br.com.benefrancis.fibonacci;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

/**
 * Recursively implemented Fibonacci sequence module for displaying extremely large numbers
 * 
 * @author Benefrancis do Nascimento
 *
 */
public class FibonacciRecursiveOtimizatedForBigNumbers {
	
	public static BigInteger[] cache;
	public static BigInteger valorCalculado;

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o enesimo termo da sequência de fibonacci para saber o seu valor: ");
		int n = sc.nextInt();

		BigInteger[] sequencia = new BigInteger[n];
		cache = new BigInteger[n];
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			sequencia[i] = fibonacci(i);
		}
		long fim = System.currentTimeMillis();
		for (BigInteger v : sequencia) {
			System.out.print("[" + v + "] ");
		}
		// @formatter:off
		
		DecimalFormat df = new DecimalFormat("###,###,###");

		System.out.printf("\n\nO valor do " 
						+ df.format(n) + "º termo da sequência de fibonacci é: " 
						+ df.format(sequencia[n - 1]));
		
		System.out.println("\r\n\nEste processamento levou: " +  df.format(fim-inicio) + " ms para ser concluído.");
		
		// @formatter:on
		sc.close();

	}

	public static BigInteger fibonacci(int n) {

		// @formatter:off
 		if (n <= 1) return new BigInteger(String.valueOf(n));

		if (cache[n]!=null) return cache[n];
		
		BigInteger a, b;

		a =   fibonacci(n - 1) ;
		b =   fibonacci(n - 2) ;

		valorCalculado = a.add(b);
		
		cache[n] = valorCalculado;
		
		return valorCalculado;
		
		// @formatter:on

	}
}
