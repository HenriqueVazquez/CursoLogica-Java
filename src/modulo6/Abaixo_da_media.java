package modulo6;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_da_media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double mediaVetor = 0, somaVetor = 0;
		int i = 0, n = 0;
		Boolean abaixoMedia = false;

		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.print("Quantos numeros voce vai digitar? ");
				n = sc.nextInt();
			} while (n < 0 && n > 10);
			
			String[] vetNumerosRecebidos = new String[n];
			double[] vetNumeros = new double[n];
			
			sc.nextLine();
			for (i = 0; i < n; i++) {
				System.out.print("Digite um numero: ");				
				vetNumerosRecebidos[i] = sc.nextLine();
			}
			
			for (i = 0; i < n; i++) {				
				
				vetNumeros[i] = Double.parseDouble(vetNumerosRecebidos[i].replace(",", "."));
				
				
			}

			for (i = 0; i < n; i++) {
				somaVetor = somaVetor + vetNumeros[i];
			}
			System.out.println();

			mediaVetor = (double) somaVetor / n;

			System.out.println("MEDIA DO VETOR = " + String.format("%.3f", mediaVetor));

			for (i = 0; i < n; i++) {
				if (vetNumeros[i] < mediaVetor) {
					abaixoMedia = true;
				}
			}

			if (abaixoMedia == true) {
				System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
			}

			for (i = 0; i < n; i++) {
				if (vetNumeros[i] < mediaVetor) {
					System.out.println(String.format("%.1f", vetNumeros[i]));
				}
			}
		}

	}

}
