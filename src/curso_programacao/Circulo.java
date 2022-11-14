package curso_programacao;

import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		 double raio, area, pi = 3.14159;
		 
		 Scanner sc = new Scanner(System.in);

		 System.out.println("Area de um criculo:" );
		 System.out.print( "Informe o raio: " );
		    raio = sc.nextDouble();
		    sc.close();


		    area = pi * Math.pow(raio, 2);
		   
		    System.out.println("Area = " + String.format("%.3f", area));

	}

}
