package modulos4;

import java.util.Scanner;

public class Dardo {

	public static void main(String[] args) {
		double d1, d2, d3, maior;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as tres distancias:");
		d1 = sc.nextDouble();
		d2 = sc.nextDouble();
		d3 = sc.nextDouble();
		sc.close();

		if (d1 > d2 && d1 > d3) {
			maior = d1;
		} else if (d2 > d3) {
			maior = d2;
		} else {
			maior = d3;
		}

		System.out.println("MAIOR DISTANCIA = " + String.format("%.2f", maior));

	}

}
