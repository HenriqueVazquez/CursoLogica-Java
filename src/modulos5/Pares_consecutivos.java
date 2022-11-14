package modulos5;

import java.util.Scanner;

public class Pares_consecutivos {

	public static void main(String[] args) {
		int X, soma;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero inteiro: ");
		X = sc.nextInt();

		while (X != 0) {

			if (X % 2 != 0) {
				X = X + 1;
			}

			soma = 5 * X + 20;
			System.out.println("SOMA = " + soma);

			System.out.print("Digite um numero inteiro: ");
			X = sc.nextInt();

		}
		sc.close();

	}

}
