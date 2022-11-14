package curso_programacao;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		  int x, y, soma;
		  
		  Scanner sc = new Scanner(System.in);

		  System.out.println("Some dois numeros: " );
		  System.out.print( "Digite x: " );
		   x = sc.nextInt();
		   System.out.print("Digite y: ");
		   y = sc.nextInt();
		   sc.close();

		   soma = x + y;


		   System.out.println("Soma = " + soma  );

	}

}
