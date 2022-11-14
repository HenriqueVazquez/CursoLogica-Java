package modulo6;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int i = 0, n = 0, somaPares = 0;

		try (Scanner sc = new Scanner(System.in)) {
			somaPares = 0;

			do {
				System.out.print("Quantos numeros voce vai digitar? ");
				n = sc.nextInt();
			} while (n < 0 && n > 10);

			int[] vetNumero = new int[n];

			for (i = 0; i < n; i++) {
				System.out.print("Digite um numero: ");
				vetNumero[i] = sc.nextInt();

			}

			System.out.println();
			for (i = 0; i < n; i++) {
				if (vetNumero[i] % 2 == 0) {
					System.out.print(vetNumero[i] + " ");
					somaPares = somaPares + 1;
				}
			}

			System.out.println();
			System.out.println("QUANTIDADE DE PARES = " + somaPares);
			sc.close();
		}
	}

}
