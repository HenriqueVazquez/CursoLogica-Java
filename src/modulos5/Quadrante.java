package modulos5;

import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		int x, y;
		String q;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite os valores das coordenadas x:  ");
		x = sc.nextInt();
		System.out.print("Digite os valores das coordenadas y:  ");
		y = sc.nextInt();
		while (x != 0 || y != 0) {
			if (x > 0 && y > 0) {
				q = "Q1";
			} else if (x < 0 && y > 0) {
				q = "Q2";
			} else if (x < 0 && y < 0) {
				q = "Q3";
			} else if (x > 0 && y < 0) {
				q = "Q4";
			} else if (x == 0 && y == 0) {
				q = "Origem";
			} else if (x == 0) {
				q = "Eixo y";
			} else {
				q = "Eixo x";
			}

			System.out.println("QUADRANTE " + q);
			System.out.print("Digite os valores das coordenadas x:  ");
			x = sc.nextInt();
			System.out.print("Digite os valores das coordenadas y:  ");
			y = sc.nextInt();
		}
		sc.close();

	}

}
