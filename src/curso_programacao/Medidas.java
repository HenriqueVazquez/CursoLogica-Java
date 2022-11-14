package curso_programacao;

import java.util.Scanner;

public class Medidas {

	public static void main(String[] args) {
		double  A, B, C, areaQuadrado, areaTriangulo, areaTrapezio;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a medida A: ");
	    A = sc.nextDouble();
	    System.out.print("Digite a medida B: ");
	    B = sc.nextDouble();
	    System.out.print("Digite a medida C: ");
	    C = sc.nextDouble();
	    sc.close();

	    areaQuadrado = A * A;
	    areaTriangulo = (A * B) / 2;
	    areaTrapezio = (A + B) / 2 * C;
	    
	    
	    System.out.println("QUADRADO = " + String.format("%.4f", areaQuadrado ));
	    System.out.println("TRIANGULO = " + String.format("%.4f", areaTriangulo  ));
	    System.out.println("TRAPEZIO = " + String.format("%.4f", areaTrapezio ));

	}

}
