package modulos4;

import java.util.Scanner;

public class Tempo_De_Jogo {

	public static void main(String[] args) {
		int horaInicial, horaFinal, duracao;

		Scanner sc = new Scanner(System.in);

		System.out.print("Hora inicial: ");
		horaInicial = sc.nextInt();
		System.out.print("Hora final: ");
		horaFinal = sc.nextInt();
		sc.close();

		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
	}

}
