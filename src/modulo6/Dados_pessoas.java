package modulo6;

import java.util.Scanner;

public class Dados_pessoas {

	public static void main(String[] args) {

		int i = 0, n = 0, j = 0, totalHomens = 0, totalMulher = 0;
		double menorAltura = 0, maiorAltura = 0, somaAlturaMulheres = 0, mediaAlturaMulheres = 0;
		Boolean temMulher = false;

		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.print("Quantas pessoas voce vai digitar? ");
				n = sc.nextInt();
			} while (n < 0 && n > 10);

			double[] vetAltura = new double[n];
			String[] vetAlturaInformada = new String[n];
			char[] vetGenero = new char[n];
			
			
			
			
			for (i = 0; i < n; i++) {
				System.out.print("Altura da " + (i + 1) + "a pessoa: ");
				sc.nextLine(); 
				vetAlturaInformada[i] = sc.nextLine();
				vetAltura[i] = Double.parseDouble(vetAlturaInformada[i].replace(",", "."));

				do {
					System.out.print("Genero da " + (i + 1) + "a pessoa: ");
					vetGenero[i] = sc.next().charAt(0);

				} while ((vetGenero[i] != 'F' && vetGenero[i] != 'f') && (vetGenero[i] != 'm' && vetGenero[i] != 'M'));
				System.out.println();
			}

			menorAltura = vetAltura[0];
			menorAltura = vetAltura[0];
			for (i = 0; i < n; i++) {
				for (j = 0; j < n; j++) {
					if (vetAltura[i] <= vetAltura[j] && vetAltura[i] <= menorAltura) {
						menorAltura = vetAltura[i];
					}
				}
			}

			for (i = 0; i < n; i++) {
				for (j = 0; j < n; j++) {
					if (vetAltura[i] >= vetAltura[j] && vetAltura[i] >= maiorAltura) {
						maiorAltura = vetAltura[i];
					}
				}
			}

			for (i = 0; i < n; i++) {
				
				if (vetGenero[i] == 'F' || vetGenero[i] == 'f') {
					somaAlturaMulheres = somaAlturaMulheres + vetAltura[i];
					temMulher = true;
					totalMulher = totalMulher + 1;
				} else if (vetGenero[i] == 'M' || vetGenero[i] == 'm') {
					totalHomens = totalHomens + 1;
				}
			}
		}

		System.out.println("Menor altura = " + String.format("%.2f", menorAltura));
		System.out.println("Maior altura = " + String.format("%.2f", maiorAltura));

		if (temMulher == true) {
			mediaAlturaMulheres = (double) somaAlturaMulheres / totalMulher;
			System.out.println("Media das alturas das mulheres = " + String.format("%.2f", mediaAlturaMulheres));
		} else {
		}
		System.out.println("Numero de homens = " + totalHomens);

	}

}
