package modulo7;

import java.util.Scanner;

public class Matriz_geral {

	public static void main(String[] args) {
		int i = 0, n = 0, j = 0, linhaEscolhida = 0, colunaEscolhida = 0;
		double somaPositivos = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Qual a ordem da matriz? ");
			n = sc.nextInt();

		} while (n <= 0 || n > 10);

		double[][] mat = new double[n][n];
		String[][] matInformada = new String[n][n];

		sc.nextLine();
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matInformada[i][j] = sc.nextLine();
				mat[i][j] = Double.parseDouble(matInformada[i][j].replace(",", "."));
			}
		}

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (mat[i][j] >= 0) {
					somaPositivos = somaPositivos + mat[i][j];
				}
			}
		}

		System.out.println("\nSOMA DOS POSITIVOS: " + somaPositivos);
		System.out.println();

		System.out.print("Escolha uma linha: ");
		linhaEscolhida = sc.nextInt();

		System.out.print("LINHA ESCOLHIDA: ");

		for (i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", mat[linhaEscolhida][i])  + " ");
		}

		System.out.print("\n\nEscolha uma coluna: ");
		colunaEscolhida = sc.nextInt();

		System.out.print("COLUNA ESCOLHIDA: ");
		for (i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", mat[i][colunaEscolhida])+ " ");
		}
		System.out.println();

		System.out.println("\n\nDIAGONAL PRINCIPAL: ");
		for (i = 0; i < n; i++)
			for (i = 0; i < n; i++) {
				System.out.print(String.format("%.1f", mat[i][i])+ " ");
			}

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					mat[i][j] = Math.pow(mat[i][j], 2);
				}
			}
		}

		System.out.println("\n\nMATRIZ ALTERADA: ");

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(String.format("%.1f", mat[i][j]) + " ");
			}
			System.out.println();
		}

	}

}
