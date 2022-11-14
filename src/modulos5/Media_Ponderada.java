package modulos5;

import java.util.Locale;
import java.util.Scanner;

public class Media_Ponderada {
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		int N, i;
		double nota1, nota2, nota3, media;

		Locale.setDefault(Locale.US);

		 try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Quantos casos voce vai digitar? ");
			N = sc.nextInt();

			for (i = 1; i <= N; i++) {
				System.out.println("Digite tres numeros: ");
				nota1 = sc.nextDouble();
				nota2 = sc.nextDouble();
				nota3 = sc.nextDouble();

				media = (double) ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);

				System.out.println("MEDIA = " + String.format("%.1f", media));

			}
			
			
			 sc.close();			
		}
		
	}

}
