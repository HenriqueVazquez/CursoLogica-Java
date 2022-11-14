package modulos4;

import java.util.Scanner;

public class Operadora {

	public static void main(String[] args) {
		int minutos;
		double valor = 50;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de minutos: ");
		minutos = sc.nextInt();
		sc.close();

		if (minutos > 100) {
			valor = (minutos - 100) * 2 + 50;

		}

		System.out.println("Valor a pagar:  " + String.format("%.2f", valor));
	}

}
