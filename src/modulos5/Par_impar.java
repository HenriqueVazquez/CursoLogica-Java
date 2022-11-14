package modulos5;

import java.util.Scanner;

/**
 * @author HeK
 *
 */
public class Par_impar {

	private static Scanner sc;

	public static void main(String[] args) {
		int N, i, x;

		sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		N = sc.nextInt();

		for (i = 1; i <= N; i++) {
			System.out.print("Digite um numero: ");
			x = sc.nextInt();

			if (x == 0) {
				System.out.println("NULO");
			} else if (x % 2 == 0) {
				if (x < 0) {
					System.out.println("PAR NEGATIVO");
				} else {
					System.out.println("PAR POSITIVO");
				}
			} else if (x < 0) {
				System.out.println("IMPAR NEGATIVO");
			} else {
				System.out.println("IMPAR POSITIVO");
			}

		}
		
		
		sc.close();

	}

}
