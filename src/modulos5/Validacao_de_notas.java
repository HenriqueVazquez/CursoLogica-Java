package modulos5;

import java.util.Locale;
import java.util.Scanner;

public class Validacao_de_notas {

	public static void main(String[] args) {
		double nota1, nota2, media;

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();

		while (nota1 < 0 || nota1 > 10) {
			System.out.print("Valor invalido! Tente novamente: ");
			nota1 = sc.nextDouble();
		}

		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();

		while (nota2 < 0 || nota2 > 10) {
			System.out.print("Valor invalido! Tente novamente: ");
			nota2 = sc.nextDouble();
		}
		sc.close();

		media = (double) (nota1 + nota2) / 2;
		System.out.println("MEDIA = " + String.format("%.2f", media));
	}

}
