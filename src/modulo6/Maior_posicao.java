package modulo6;

import java.util.Locale;
import java.util.Scanner;

public class Maior_posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int i = 0, n = 0, j = 0, posicao = 0;
		double maiorNumero = 0;

		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.print("Quantos numeros voce vai digitar? ");
				n = sc.nextInt();
			} while (n < 0 && n > 10);

			double[] vetNumero = new double[n];

			for (i = 0; i < n; i++) {
				System.out.print("Digite um numero: ");
				vetNumero[i] = sc.nextDouble();
			}

			for (i = 0; i < n; i++) {
				for (j = 0; j < n; j++) {
					if (vetNumero[i] >= vetNumero[j] && vetNumero[i] >= maiorNumero) {
						maiorNumero = vetNumero[i];
						posicao = i;
					}
				}
			}

			sc.close();
		}
		
		System.out.println();
		System.out.println("MAIOR VALOR = " + String.format("%.1f", maiorNumero));		
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);

	}

}
