package modulos4;

import java.util.Scanner;

public class Baskara {
	public static void main(String[] args) {

		double a, b, c, x1, x2, delta;

		Scanner sc = new Scanner(System.in);

		System.out.print("Coeficiente a: ");
		a = sc.nextDouble();
		System.out.print("Coeficiente b: ");
		b = sc.nextDouble();
		System.out.print("Coeficiente c: ");
		c = sc.nextDouble();
		sc.close();

		delta = Math.pow(b, 2) - 4 * a * c;

		if (a == 0 || delta < 0) {
			System.out.println("Esta equacao nao possui raizes reais");
		} else {

			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.println("X1 = " + String.format("%.4f", x1));
			System.out.println("X2 = " + String.format("%.4f", x2));
		}
	}
}
