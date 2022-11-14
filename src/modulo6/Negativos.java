package modulo6;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		int n = 0, i = 0;
		boolean temNegativo = false;

		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.print("Quantos numeros voce vai digitar? ");
				n = sc.nextInt();
			} while (n < 0 && n > 10);

			int[] vet = new int[n];

			for (i = 0; i < n; i++) {
				System.out.print("Digite um numero: ");
				vet[i] = sc.nextInt();
			}

			for (i = 0; i < n; i++) {
				if (vet[i] < 0) {
					temNegativo = true;

				}
			}

			if (temNegativo == true) {
				System.out.println("Numeros negativos: ");
			} else {
				System.out.println("Não digitou numeros negativos: ");
			}

			for (i = 0; i < n; i++) {
				if (vet[i] < 0) {
					System.out.println(vet[i]);
				}
			}

			sc.close();
		}

	}

}
