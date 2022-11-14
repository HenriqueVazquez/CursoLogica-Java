package curso_programacao;

import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {
		double largura, comprimento, valorMetro, area, precoTerreno;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();

		System.out.print("Digite o valor do metro quadrado: ");
		valorMetro = sc.nextDouble();
		sc.close();

		area = largura * comprimento;
		precoTerreno = area * valorMetro;

		System.out.println("Area do terreno: " + String.format("%.2f", area));
		System.out.println("Preco do terreno: " + String.format("%.2f", precoTerreno));

	}

}
