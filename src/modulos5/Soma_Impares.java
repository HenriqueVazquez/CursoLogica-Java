package modulos5;

import java.util.Scanner;

public class Soma_Impares {

	public static void main(String[] args) {
		 int x, y, soma, i, troca ;
		 
		 Scanner sc = new Scanner(System.in);


		    System.out.println("Digite dois numeros ou duas vezes o zero para finalizar: ");
		    x = sc.nextInt();
		    y = sc.nextInt();

		    while (x != 0  || y != 0)
		    {
		        i = 0;
		            soma = 0;

		        if (x > y)
		        {
		            troca = x;
		            x = y;
		            y = troca;
		        }
		        for(i = x + 1; i <= y - 1; i++)
		        {
		            if(i % 2 != 0)
		            {
		                soma = soma + i;
		            }
		        }

		        System.out.println("Soma dos impare = " + soma );
		        soma = 0;
		        System.out.println("Digite dois numeros ou duas vezes o zero para finalizar: ");
			    x = sc.nextInt();
			    y = sc.nextInt();
		    }

	}

}
