package modulos5;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int n, i;

		Scanner sc = new Scanner(System.in);

		System.out.print("Deseja a tabuada para qual valor ou digite 0 para sair? ");
		n = sc.nextInt();

		while (n != 0) {
			for (i = 1; i <= 10; i++) {
				System.out.println(n + " X " + i + " = " + n * i);
			}
			System.out.println("Deseja a tabuada para qual valor ou digite 0 para sair? ");
			n = sc.nextInt();

		}
		sc.close();
	}

}
