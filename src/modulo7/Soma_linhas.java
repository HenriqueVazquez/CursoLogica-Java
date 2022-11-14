package modulo7;

import java.util.Scanner;

public class Soma_linhas {

	public static void main(String[] args) {
		int m = 0, i = 0, n = 0, j = 0;
		double somaLinhas = 0;
		String matInformada;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Qual a quantidade de linhas da matriz? ");
			m = sc.nextInt();
		} while (m < 0 && m > 10);

		do {
			System.out.print("Qual a quantidade de colunas da matriz? ");
			n = sc.nextInt();
		} while (n < 0 && n > 10);
		double[][] mat = new double[m][n];
		double[] vetor = new double[m];

		sc.nextLine();
		for (i = 0; i < m; i++) {
			System.out.println("Digite os elementos da " + (i + 1) + "a linha:");

			for (j = 0; j < n; j++) {
				matInformada = sc.nextLine();
				mat[i][j] = Double.parseDouble(matInformada.replace(",", "."));
				;
			}
		}

		for (i = 0; i < m; i++) {
			somaLinhas = 0;

			for (j = 0; j < n; j++) {
				somaLinhas = somaLinhas + mat[i][j];
			}
			vetor[i] = somaLinhas;
		}

		System.out.println("VETOR GERADO:");
		for (i = 0; i < m; i++) {
			System.out.printf("%.1f\n", vetor[i]);
		}

		sc.close();
	}
}
