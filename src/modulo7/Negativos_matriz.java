package modulo7;

import java.util.Scanner;

public class Negativos_matriz {

	public static void main(String[] args) {
		 int  m, i, n, j;
		    Boolean temNegativo = false;
		    
		    Scanner sc = new Scanner(System.in);
		    		

		    do
		    {
		         System.out.print("Qual a quantidade de linhas da matriz? " );
		        m = sc.nextInt();
		    }
		    while(m < 0 && m > 10);

		    do
		    {
		        System.out.print("Qual a quantidade de colunas da matriz? " );
		       n = sc.nextInt();;
		    }
		    while(n < 0 && n > 10);

		    int[][] mat = new int[m][n];

		    for(i = 0; i < m; i++)
		    {
		        for(j = 0; j < n; j++)
		        {
		        	System.out.print("Elemento [" + i  +  " ," + j + " ]: ");
		            mat[i][j] = sc.nextInt();
		        }

		    }

		    for(i = 0; i < m; i++)
		    {
		        for(j = 0; j < n; j++)
		        {
		            if(mat[i][j]  < 0)
		            {
		                temNegativo = true;
		            }
		        }
		    }

		    if(temNegativo == true)
		    {
		        System.out.println( "VALORES NEGATIVOS: "  );
		    }


		    for(i = 0; i < m; i++)
		    {
		        for(j = 0; j < n; j++)
		        {
		            if(mat[i][j]  < 0)
		            {
		            	System.out.println(mat[i][j] );
		            }


		        }
		    }

	}

}
