package modulo6;

import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		int i = 0, n = 0, somaMaiorIdade = 0;
		double somaAltura = 0, mediaAltura = 0, porcentagemMenorIdade = 0;

		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.print("Quantas pessoas serao digitadas? ");
				n = sc.nextInt();
			} while (n < 0 && n > 10);

			int[] vetIdade = new int[n];
			double[] vetAltura = new double[n];
			String[] vetNome = new String[n];

			for (i = 0; i < n; i++) {
				System.out.println("Dados da " + i + 1 + "a pessoa: ");
				System.out.print("Nome: ");
				sc.nextLine();
				vetNome[i] = sc.nextLine();

				System.out.print("Idade: ");
				vetIdade[i] = sc.nextInt();

				System.out.print("Altura: ");
				vetAltura[i] = sc.nextDouble();
				System.out.println();
			}

			for (i = 0; i < n; i++) {
				somaAltura = somaAltura + vetAltura[i];
			}

			mediaAltura = somaAltura / n;

			System.out.println("Altura média: " + String.format("%.2f", mediaAltura));

			for (i = 0; i < n; i++) {
				if (vetIdade[i] < 16) {
					somaMaiorIdade = somaMaiorIdade + 1;
				}
			}

			porcentagemMenorIdade = (double) (somaMaiorIdade * 100) / n;

			System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", porcentagemMenorIdade) + "%");

			for (i = 0; i < n; i++) {
				if (vetIdade[i] < 16) {
					System.out.println(vetNome[i]);
				}
			}
			sc.close();
		}

	}

}
