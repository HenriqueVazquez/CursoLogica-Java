package modulos4;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		int x, y;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois numeros inteiros:");
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();

		if (x % y == 0 || y % x == 0) {
			System.out.println("Sao multiplos");
		} else {
			System.out.println("Nao sao multiplos");
		}

	}

}
