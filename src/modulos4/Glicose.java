package modulos4;

import java.util.Scanner;

public class Glicose {

	public static void main(String[] args) {
		double glicose;
		String classificacao;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a medida da glicose: ");
		glicose = sc.nextDouble();
		sc.close();
		
		if (glicose <= 100) {
			classificacao = "Normal";
		} else if (glicose <= 140) {
			classificacao = "Elevado";
		} else {
			classificacao = "Diabetes";
		}
		System.out.println("Classificacao: " + classificacao);

	}

}
