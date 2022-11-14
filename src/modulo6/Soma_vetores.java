package modulo6;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int i = 0, n = 0;

		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.print("Quantos numeros voce vai digitar? ");
				n = sc.nextInt();
			} while (n < 0 && n > 10);

			double[] vetNumeroA = new double[n];
			double[] vetNumeroB = new double[n];
			double[] vetNumeroC = new double[n];

			System.out.println("Digite os valores do vetor A: ");
			for (i = 0; i < n; i++) {
				vetNumeroA[i] = sc.nextDouble();
			}

			System.out.println("Digite os valores do vetor B: ");
			for (i = 0; i < n; i++) {
				vetNumeroB[i] = sc.nextDouble();
			}

			for (i = 0; i < n; i++) {
				vetNumeroC[i] = vetNumeroA[i] + vetNumeroB[i];
			}

			System.out.println();
			System.out.println("VETOR RESULTANTE:");
			for (i = 0; i < n; i++) {
				System.out.println(vetNumeroC[i]);
			}
		}

	}

}
