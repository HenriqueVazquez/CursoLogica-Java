package modulos5;

import java.util.Scanner;

public class Dentro_fora {

	public static void main(String[] args) {
		int x = 0, n = 0, dentro = 0, fora = 0, i = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Quantos numeros voce vai digitar? ");
			n = sc.nextInt();

			for (i = 1; i <= n; i++) {
				System.out.print("Digite um numero: ");
				x = sc.nextInt();

				if (x >= 10 && x <= 20) {
					dentro = dentro + 1;
				} else {
					fora = fora + 1;
				}
			}

			System.out.println(dentro + " DENTRO");
			System.out.println(fora + " FORA");
		} while (x == 0);

	}

}
