package modulos4;

import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {
		double salario, salarioAtualizado, aumento, porcentagem = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Calcular ajuste do funcionario");

		System.out.print("Digite o salrio do funcionario: ");
		salario = sc.nextDouble();
		sc.close();

		if (salario <= 1000) {
			porcentagem = 0.20;
		} else if (salario <= 3000) {
			porcentagem = 0.15;
		} else if (salario <= 8000) {
			porcentagem = 0.10;
		} else {
			System.out.println("Calcule novamente");
		}

		aumento = salario * porcentagem;
		salarioAtualizado = salario + aumento;

		System.out.println("Novo salario = " + String.format("%.2f", salarioAtualizado));
		System.out.println("Aumento = " + String.format("%.2f", aumento));
		System.out.println("Porcentagem = " + String.format("%.2f", porcentagem * 100) + " %");
	}

}
