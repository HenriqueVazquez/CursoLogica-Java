package curso_programacao;

import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		double distancia, combustivelGasto, consumo;
		
		Scanner sc = new Scanner(System.in);

		System.out.println( "Calculo de consumo:" );
		System.out.print("Distancia percorrida: ");
	    distancia = sc.nextDouble();
	    System.out.print("Combustível gasto: ");
	    combustivelGasto = sc.nextDouble();
	    sc.close();


	    consumo = distancia / combustivelGasto;
	    
	    System.out.println("O consumo medio = " + String.format("%.3f", consumo ));

	}

}
