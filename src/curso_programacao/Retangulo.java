package curso_programacao;

import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		double base, altura, area, perimetro, diagonal;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a base do retangulo: ");
	    base = sc.nextDouble();
	    System.out.print("Digite altura do retangulo: ") ;
	    altura = sc.nextDouble();
	    sc.close();


	    area =  base * altura;
	    perimetro = 2 *(base + altura);
	    diagonal = Math.sqrt(Math.pow(base,2) + Math.pow(altura, 2));



	    
	    System.out.println("Area: " + String.format("%.4f",  area  ));
	    System.out.println( "Perimetro: " + String.format("%.4f", perimetro  ));
	    System.out.println("Diagonal: " + String.format("%.4f", diagonal  ));

	}

}
