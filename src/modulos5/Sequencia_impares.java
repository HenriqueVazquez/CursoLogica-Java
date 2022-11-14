package modulos5;

import java.util.Scanner;

public class Sequencia_impares {

	public static void main(String[] args) {
		int x, i;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Digite o valor de X ou 0 para finalizar: ");
			x = sc.nextInt();
			for (i = 1; i <= x; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		} while (x != 0);

	}

}
