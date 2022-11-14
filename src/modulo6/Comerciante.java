package modulo6;

import java.util.Scanner;

public class Comerciante {

	public static void main(String[] args) {
		int i = 0, n = 0, lucroMenor10 = 0, lucroEntre10e20 = 0, lucroAcima20 = 0;
		double valorTotalCompra = 0, valorTotalVenda = 0, valorTotalLucro = 0;

		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.print("Serao digitados dados de quantos produtos? ");
				n = sc.nextInt();
			} while (n < 0 && n > 10);

			double[] vetPrecoCompra = new double[n];
			double[] vetPrecoVenda = new double[n];
			String[] vetPrecoCompraInformado = new String[n];
			String[] vetPrecoVendaInformado = new String[n];
			double[] vetLucro = new double[n];
			String[] vetNome = new String[n];
			
			sc.nextLine();
			for (i = 0; i < n; i++) {
				System.out.println("Produto: " + (i + 1));
				System.out.print("Nome: ");
				
				vetNome[i] = sc.nextLine();

				System.out.print("Preco de compra: ");
				vetPrecoCompraInformado[i] = sc.nextLine();
				

				System.out.print("Preco de venda: ");
				vetPrecoVendaInformado[i] = sc.nextLine();
				
				vetPrecoCompra[i] = Double.parseDouble(vetPrecoCompraInformado[i].replace(",", "."));
				vetPrecoVenda[i] = Double.parseDouble(vetPrecoVendaInformado[i].replace(",", "."));
				System.out.println();
			}

			for (i = 0; i < n; i++) {
				vetLucro[i] = (double) ((vetPrecoVenda[i] * 100) / vetPrecoCompra[i]) - 100;
			}

			for (i = 0; i < n; i++) {
				if (vetLucro[i] < 10) {
					lucroMenor10 = lucroMenor10 + 1;
				} else {
					if (vetLucro[i] >= 10 && vetLucro[i] < 20) {
						lucroEntre10e20 = lucroEntre10e20 + 1;
					} else {

						lucroAcima20 = lucroAcima20 + 1;

					}
				}
			}

			for (i = 0; i < n; i++) {
				valorTotalCompra = valorTotalCompra + vetPrecoCompra[i];
				valorTotalVenda = valorTotalVenda + vetPrecoVenda[i];

			}
		}

		valorTotalLucro = valorTotalVenda - valorTotalCompra;

		System.out.println("RELATORIO: ");
		System.out.println("Lucro abaixo de 10%: " +  lucroMenor10);
		System.out.println("Lucro entre 10% e 20%: " + lucroEntre10e20);
		System.out.println("Lucro acima de 20%: " + lucroAcima20);
		System.out.println("Valor total de compra: " + String.format("%.2f",valorTotalCompra));
		System.out.println("Valor total de venda: " + String.format("%.2f",valorTotalVenda));
		System.out.println("Lucro total: " + String.format("%.2f",valorTotalLucro));

	}

}
