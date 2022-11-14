package modulos5;

import java.util.Scanner;

public class Senha_fixa {

	public static void main(String[] args) {
		 int senha ;
		 
		 Scanner sc =new Scanner(System.in);
		 


		    System.out.print("Digite a senha:  ");
		    senha = sc.nextInt();
		    while(senha != 2002)
		    {
		        System.out.print("Senha Invalida! Tente novamente: " );
		        senha = sc.nextInt();
		    }
		    System.out.println("\nAcesso permitido!" );
		    sc.close();

	}

}
