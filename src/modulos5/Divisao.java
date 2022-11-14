package modulos5;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		int N = 0, i = 0;
		double x = 0, y = 0, divisao = 0;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Quantos casos voce vai digitar? ");
			N = sc.nextInt();

			for (i = 1; i <= N; i++) {
				System.out.print("\nEntre com o numerador: ");
				x = sc.nextDouble();
				System.out.print("Entre com o denominador: ");
				y = sc.nextDouble();

				if (y == 0) {
					System.out.println("DIVISAO IMPOSSIVEL");
				} else {

					divisao = x / y;
					System.out.println("DIVISAO = " + String.format("%.2f", divisao) );
					
				}
			}
			sc.close();
		}
	}

}
