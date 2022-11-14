package modulos4;

import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		int codigo, quantidade;
		double valorPago = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Codigo do produto comprado: ");
		codigo = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		sc.close();

		switch (codigo) {
		case 1:
			valorPago = 5.0 * quantidade;
			break;
		case 2:
			valorPago = 3.5 * quantidade;
			break;
		case 3:
			valorPago = 4.8 * quantidade;
			break;
		case 4:
			valorPago = 8.9 * quantidade;
			break;
		case 5:
			valorPago = 7.32 * quantidade;
			break;
		}

		System.out.print("Valor a pagar: R$ " + String.format("%.2f", valorPago));

	}

}
