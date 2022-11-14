package modulos5;

import java.util.Scanner;

public class Combustivel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int Gasolina = 0, Alcool = 0, Diesel = 0, codigo = 0;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			codigo = sc.nextInt();

			while (codigo < 1 || codigo > 4) {
				System.out.print("Informe um codigo valido (1, 2, 3) ou 4 para parar: ");
				codigo = sc.nextInt();
			}

			

			switch (codigo) {
			case 1:
				Alcool = Alcool + 1;
				break;
			case 2:
				Gasolina = Gasolina + 1;
				break;
			case 3:
				Diesel = Diesel + 1;
				break;
			}

		} while (codigo != 4);

		System.out.println("MUITO OBRIGADO");
		System.out.println("1- Alcool: " + Alcool);
		System.out.println("2- Gasolina: " + Gasolina);
		System.out.println("3- Diesel: " + Diesel);
		sc.close();
	}

}
