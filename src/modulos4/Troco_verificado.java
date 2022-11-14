package modulos4;

import java.util.Scanner;

public class Troco_verificado {
	public static void main(String[] args) {
		double preco, dinheiro, troco, resto;
		int quantidade;

		Scanner sc = new Scanner(System.in);

		System.out.print("Preco unitario do produto: ");
		preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		sc.close();

		if (dinheiro >= (preco * quantidade)) {
			troco = (double) dinheiro - preco * quantidade;

			System.out.println("TROCO = " + String.format("%.2f", troco));
		} else {
			resto = preco * quantidade - dinheiro;

			System.out.println("DINHEIRO INSUFICIENTE. FALTAM " + String.format("%.2f", resto) + " REAIS");
		}
	}

}
