package modulo6;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double soma, media;
		int i = 0, n = 0;

		try (Scanner sc = new Scanner(System.in)) {
			soma = 0;

			do {
				System.out.print("Quantos numeros voce vai digitar? ");
				n = sc.nextInt();
			} while (n < 0 && n > 10);

			double[] vet = new double[n];

			for (i = 0; i < n; i++) {
				System.out.print("Digite um numero para somar: ");
				vet[i] = sc.nextDouble();
			}

			System.out.print("VALORES = ");
			for (i = 0; i < n; i++) {
				System.out.print(String.format("%.1f", vet[i]) + " ");

			}

			for (i = 0; i < n; i++) {
				soma = soma + vet[i];
			}
			sc.close();
		}

		media = (double) soma / n;

		System.out.println(" ");
		System.out.println("SOMA = " + String.format("%.2f", soma));
		System.out.println("Media = " + String.format("%.2f", media));

	}

}
