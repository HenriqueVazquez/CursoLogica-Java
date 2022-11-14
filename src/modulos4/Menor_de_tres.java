package modulos4;

import java.util.Scanner;

public class Menor_de_tres {
	public static void main(String[] args) {
		int a, b, c, menor;
		Scanner sc = new Scanner(System.in);

		System.out.print("Primeiro valor: ");
		a = sc.nextInt();
		System.out.print("Segundo valor: ");
		b = sc.nextInt();
		System.out.print("Terceiro valor: ");
		c = sc.nextInt();
		sc.close();

		if (a < b && a < c) {
			menor = a;
		} else if (b < c) {
			menor = b;
		} else {
			menor = c;
		}

		System.out.println("MENOR = " + menor);

	}

}
