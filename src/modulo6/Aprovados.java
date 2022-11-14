package modulo6;

import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		int i = 0, n = 0;
		Boolean temAprovado = false;

		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.print("Quantas pessoas voce vai digitar? ");
				n = sc.nextInt();
			} while (n < 0 && n > 10);

			double[] mediasNotas = new double[n];
			double[] vetNota1 = new double[n];
			double[] vetNota2 = new double[n];
			String[] vetNota1Recebida = new String[n];
			String[] vetNota2Recebida = new String[n];
			String[] aprovados = new String[n];
			String[] vetNome = new String[n];

			sc.nextLine();
			for (i = 0; i < n; i++) {
				System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
				vetNome[i] = sc.nextLine();
				vetNota1Recebida[i] = sc.nextLine();
				vetNota2Recebida[i] = sc.nextLine();

			}

			for (i = 0; i < n; i++) {
				vetNota1[i] = Double.parseDouble(vetNota1Recebida[i].replace(",", "."));
				vetNota2[i] = Double.parseDouble(vetNota2Recebida[i].replace(",", "."));

			}

			for (i = 0; i < n; i++) {
				mediasNotas[i] = (double) (vetNota1[i] + vetNota2[i]) / 2;
			}

			for (i = 0; i < n; i++) {
				if (mediasNotas[i] >= 6) {
					temAprovado = true;
					aprovados[i] = vetNome[i];
				}
			}

			System.out.println();
			if (temAprovado == true) {
				System.out.println("Alunos aprovados: ");
				for (i = 0; i < n; i++) {
					if (mediasNotas[i] >= 6) {
						System.out.println(aprovados[i]);
					}

				}
			}
		}

	}

}
