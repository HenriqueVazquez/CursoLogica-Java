package modulo7;

import java.util.Scanner;

public class Acima_diagonal {

	public static void main(String[] args) {



	    int i = 0, n = 0, j = 0, somaDiagonalPrincipal = 0;
	    
	    Scanner sc = new Scanner(System.in);


	    do
	    {
	        System.out.print("Qual a quantidade de colunas da matriz? " );
	        n = sc.nextInt();
	    }
	    while(n < 0 && n > 10);

	    int[][] mat = new int[n][n];

	    for(i = 0; i < n; i++)
	    {
	        for(j = 0; j < n; j++)
	        {
	            System.out.print("Elemento [" + i + "," + j + "]: " );
	           mat[i][j] = sc.nextInt();
	        }
	    }

	    for(i = 0; i < n; i++)
	    {
	        for(j = i + 1; j < n; j++)
	        {
	            somaDiagonalPrincipal = somaDiagonalPrincipal + mat[i][j];
	        }

	    }


	   System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + somaDiagonalPrincipal );

	}

}
