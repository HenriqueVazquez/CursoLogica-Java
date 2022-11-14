package modulos4;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		 double  nota1, nota2, notaFinal;
		 
		 Scanner sc = new Scanner(System.in);

		 System.out.print("Digite a primeira nota: ");
		    nota1 = sc.nextDouble();
		    System.out.print("Digite a segunda nota: ");
		    nota2 = sc.nextDouble();
		    sc.close();

		    notaFinal = nota1 + nota2;

		    System.out.println("NOTA FINAL = " +  String.format("%.1f", notaFinal ));

		    
		    if(notaFinal < 60.0)
		    {
		    	System.out.println("REPROVADO" );
		    }
		    else
		    {
		    	System.out.println("APROVADO" );
		    }

	}

}
