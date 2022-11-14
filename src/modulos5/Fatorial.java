package modulos5;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		  int  N, i , fat ;
		  
		  Scanner sc = new Scanner(System.in);

		  System.out.print("Digite o valor de N: ");
		   N = sc.nextInt();
		   sc.close();

		   fat = 1;
		   for(i = 1; i <= N; i++){
		      fat = fat * i;
		   }

		   System.out.println("FATORIAL = " + fat );
		   
		  

	}

}
