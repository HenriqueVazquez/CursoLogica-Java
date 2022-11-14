package modulos5;

import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		int x = 0, y = 0;
		String ordem;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro numero:  ");
		x = sc.nextInt();
		System.out.print("Digite o primeiro numero:  ");
		y = sc.nextInt();

		while (x != y) {
			if (x > y) {
				ordem = "Decrescente";
			} else {
				ordem = "Crescente";
			}
			System.out.println("A ordem de " + x + " e " + y + " eh: " + ordem);

			System.out.print("Digite o primeiro numero:  ");
			x = sc.nextInt();
			System.out.print("Digite o primeiro numero:  ");
			y = sc.nextInt();
		}
		sc.close();
		System.out.println("FIM");

	}

}
