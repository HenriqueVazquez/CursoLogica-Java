package curso_programacao;

import java.util.Scanner;

public class Duracao {

	public static void main(String[] args) {
		int duracao, segundos, horas, resto, minutos;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("duração: " );
		System.out.print("Digite a duração em segundos: ");
	    duracao = sc.nextInt();
	    sc.close();


	    horas =  duracao  / 3600;
	    resto = duracao % 3600;

	    minutos = resto / 60;
	    segundos  = resto %  60;

	    System.out.println(horas + ":" + minutos + ":" + segundos );

	}

}
