package modulo6;

import java.util.Scanner;

public class Mais_velho {

	public static void main(String[] args) {
		int i = 0, n = 0, j = 0, posicaoMaisVelho = 0;

		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.print("Quantas pessoas voce vai digitar? ");
				n = sc.nextInt();
			} while (n < 0 && n > 10);
			int[] vetIdade = new int[n];
			String[] vetNome = new String[n];
			
			
			for (i = 0; i < n; i++) {
				System.out.println("Dados da " + (i + 1) + "a pessoa: ");
				sc.nextLine();
				System.out.print("Nome: ");
				vetNome[i] = sc.nextLine();
				;

				System.out.print("Idade: ");
				vetIdade[i] = sc.nextInt();
				System.out.println();
			}

			for (i = 0; i < n; i++) {
				for (j = 0; j < n; j++) {
					if (vetIdade[i] >= vetIdade[j] && vetIdade[i] >= vetIdade[posicaoMaisVelho]) {
						posicaoMaisVelho = i;
					}
				}
			}

			System.out.println("PESSOA MAIS VELHA: " + vetNome[posicaoMaisVelho]);
		}

	}

}
