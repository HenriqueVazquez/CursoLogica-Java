package modulo7;

import java.util.Scanner;

public class Diagonal_negativo {

	public static void main(String[] args) {
		 int i , n = 0, j , somaNegativos = 0;
		 
		 Scanner sc = new Scanner(System.in);


		   do
		    {
		        System.out.print("Qual a ordem da matriz? " );
		         n = sc.nextInt();
		    }
		    while(n < 0 && n > 10);

		    int[][] mat = new int[n][n];

		    for(i = 0; i < n; i++)
		    {
		        for(j = 0; j < n; j++)
		        {
		        	System.out.print( "Elemento [" + i +  "," + j + "]: ");
		         mat[i][j] = sc.nextInt();
		        }
		    }


		    System.out.println("DIAGONAL PRINCIPAL:" );
		   for(i = 0; i < n; i++)
		    {
			   System.out.print( mat[i][i] + " ");
		    }
		   System.out.println();


		   for(i = 0; i < n; i++)
		    {
		        for(j = 0; j < n; j++)
		        {
		         if(mat[i][j] < 0){
		            somaNegativos = somaNegativos + 1;
		         }
		        }
		    }

		   System.out.println("QUANTIDADE DE NEGATIVOS = " + somaNegativos);

	}

}
