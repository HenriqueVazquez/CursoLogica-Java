package modulos4;

import java.util.Scanner;

public class Coodenadas {

	public static void main(String[] args) {
		 double X, Y ;

		 Scanner sc = new Scanner(System.in);

		    System.out.print("Valor de X: ");
		    X = sc.nextDouble();
		    System.out.print("Valor de Y: ");
		    Y = sc.nextDouble();
		    sc.close();

		    if(X > 0 && Y > 0)
		    {
		    	 System.out.println("Q1" );
		    }
		    else if (X < 0 && Y > 0)
		    {
		    	System.out.println("Q2" );
		    }
		    else if (X < 0 && Y < 0)
		    {
		    	System.out.println("Q3" );
		    }
		    else if (X > 0 && Y < 0)
		    {
		    	System.out.println("Q4" );
		    }
		    else if (X == 0 && Y == 0)
		    {
		    	System.out.println("Origem" );
		    }
		    else if (X == 0)
		    {
		    	System.out.println("Eixo Y" );
		    }
		    else
		    {
		    	System.out.println("Eixo X");
		    }


	}

}
