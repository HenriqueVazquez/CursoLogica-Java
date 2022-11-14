package modulo7;

import java.util.Scanner;

public class Soma_matrizes {

	public static void main(String[] args) {
		int m = 0, i = 0, n = 0, j = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Qual a quantidade de linhas da matriz? ");
			m = sc.nextInt();
		} while (m < 0 && m > 10);

		do {
			System.out.print("Qual a quantidade de colunas da matriz? ");
			n = sc.nextInt();
		} while (n < 0 && n > 10);

		int[][] matA = new int[m][n];
		int[][] matB = new int[m][n];
		int[][] matSoma = new int[m][n];

		System.out.println("Digite os valores da matriz A: ");

		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + " ," + j + " ]: ");
				matA[i][j] = sc.nextInt();
			}
		}

		System.out.println("Digite os valores da matriz B: ");

		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + " ," + j + " ]: ");
				matB[i][j] = sc.nextInt();

			}
		}

		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				matSoma[i][j] = matA[i][j] + matB[i][j];
			}

		}

		System.out.println("MATRIZ SOMA: ");

		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(matSoma[i][j] + " ");
			}
			System.out.println();
		}

	}

}
