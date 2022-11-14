package modulos5;

import java.util.Scanner;

public class Experiencias {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int N = 0, i = 0, qte = 0, totalCobaias = 0, totalSapos = 0, totalCoelhos = 0, totalRatos = 0,
				tipoCobaiaCorreto = 0;
		double pratos = 0, psapos = 0, pcoelhos = 0;
		char tipoCobaia;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Quantos casos de teste serao digitados? ");
			N = sc.nextInt();

			while (N <= 0) {
				N = 0;
				System.out.println("Digite um numero inteiro? ");
				N = sc.nextInt();
			}

			for (i = 1; i <= N; i++) {

				do {
					System.out.print("Quantidade de cobaias: ");
					qte = sc.nextInt();
				} while (qte <= 0);

				do {
					System.out.println("Digite o tipo de cobaia correto:");
					System.out.println("R para rato");
					System.out.println("S para sapo");
					System.out.println("C para coelho");
					System.out.println("Tipo de cobaia: ");

					tipoCobaia = sc.next().charAt(0);
					

					if (tipoCobaia == 's' || tipoCobaia == 'S') {
						tipoCobaiaCorreto = 1;
					} else if (tipoCobaia == 'c' || tipoCobaia == 'C') {
						tipoCobaiaCorreto = 1;
					} else if (tipoCobaia == 'r' || tipoCobaia == 'R') {
						tipoCobaiaCorreto = 1;
					} else {
						tipoCobaiaCorreto = 0;
					}
				} while (tipoCobaiaCorreto == 0);
				

				if (tipoCobaia == 's' || tipoCobaia == 'S') {
					totalSapos = totalSapos + qte;
				}

				else if (tipoCobaia == 'c' || tipoCobaia == 'C') {
					totalCoelhos = totalCoelhos + qte;
				} else if (tipoCobaia == 'r' || tipoCobaia == 'R') {

					totalRatos = totalRatos + qte;
				}
			}
			
			
			sc.close();
		}

		totalCobaias = totalRatos + totalSapos + totalCoelhos;

		pcoelhos = (double) totalCoelhos / totalCobaias * 100.0;
		pratos = (double) totalRatos / totalCobaias * 100.0;
		psapos = (double) totalSapos / totalCobaias * 100.0;

		System.out.println("RELATORIO FINAL:");
		System.out.println("Total: " + totalCobaias + " cobaias");
		System.out.println("Total de coelhos: " + totalCoelhos);
		System.out.println("Total de ratos: " + totalRatos);
		System.out.println("Total de sapos: " + totalSapos);
		System.out.println("Percentual de coelhos: " + String.format("%.2f", pcoelhos));
		System.out.println("Percentual de ratos: " + String.format("%.2f", pratos));
		System.out.println("Percentual de sapos: " + String.format("%.2f", psapos));

	}

}
