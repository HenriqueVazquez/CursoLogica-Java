package modulos5;

import java.util.Scanner;

public class Media_idades {

	public static void main(String[] args) {
		int idade, soma, cont;
		double media;

		Scanner sc = new Scanner(System.in);

		soma = 0;
		cont = 0;
		System.out.println("Digite as idades: ");
		idade = sc.nextInt();

		while (idade >= 0) {
			soma = soma + idade;
			cont = cont + 1;
			idade = sc.nextInt();
		}
		if (cont == 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		} else {
			media = (double) soma / cont;

			System.out.println("MEDIA = " + String.format("%.2f", media));
		}
		sc.close();

	}

}
