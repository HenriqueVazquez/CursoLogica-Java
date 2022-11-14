package modulo6;

import java.util.Scanner;

public class Media_pares {

	public static void main(String[] args) {
		int somaVetor = 0;
		double mediaPares = 0;
		int i = 0, n = 0, contPar = 0;
		Boolean temPar = false;

		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.print("Quantos numeros voce vai digitar? ");
				n = sc.nextInt();
			} while (n < 0 && n > 10);

			int[] vetNumeros = new int[n];

			for (i = 0; i < n; i++) {
				System.out.print(i + 1 + "- Digite um numero: ");
				vetNumeros[i] = sc.nextInt();
			}

			for (i = 0; i < n; i++) {
				if (vetNumeros[i] % 2 == 0) {
					somaVetor = somaVetor + vetNumeros[i];
					temPar = true;
					contPar = contPar + 1;
				}
			}
			sc.close();
		}

		if (temPar != true) {

			System.out.println("NENHUM NUMERO PAR");
		} else {
			mediaPares = (double) somaVetor / contPar;

			System.out.println("MEDIA DOS PARES = " + String.format("%.1f", mediaPares));
		}

	}

}
