package modulo7;

import java.util.Scanner;

public class Cada_linha {

	public static void main(String[] args) {
		int i, maior = 0, n, j;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Qual a quantidade de colunas da matriz? ");
			n = sc.nextInt();
		} while (n < 0 && n > 10);

		int[][] mat = new int[n][n];
		int[] maiorDaLinha = new int[n];

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}

		for (i = 0; i < n; i++) {
			maior = mat[i][0];

			for (j = 0; j < n; j++) {
				if (maior < mat[i][j]) {
					maior = mat[i][j];
				}
			}
			maiorDaLinha[i] = maior;
		}

		System.out.println();

		System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
		for (i = 0; i < n; i++) {
			System.out.println(maiorDaLinha[i]);
		}

	}

}
