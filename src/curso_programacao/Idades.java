package curso_programacao;

import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		  double  mediaIdade;
		    int idade1, idade2;
		    String  nome1, nome2;
		    
		    Scanner sc = new Scanner(System.in);
		    
		    System.out.println("Dados da primeira pessoa: " );
		    System.out.print("Nome: " );
		    nome1 = sc.nextLine();
		    System.out.print("idade: " );
		    idade1 = sc.nextInt();
		    System.out.println("Dados da segunda pessoa: " );
		    System.out.print("Nome: " );
		    sc.nextLine();
		    nome2 = sc.nextLine();

		    System.out.print("idade: " );
		    idade2 = sc.nextInt();
		    sc.close();

		    mediaIdade = (double)(idade1 + idade2) / 2.0;
		
		    System.out.println("A idade media de " + nome1 + " e " + nome2 + " e de " + String.format("%.1f", mediaIdade) +" anos!" );


	}

}
