package modulos4;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {

		double temperatura, temperaturaConvertida = 0;
	    char unidadeMedida,  unidadeMedidaResposta = 0;
	    String unidadeResposta;
	    
	    Scanner sc = new Scanner(System.in);


	    System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
	    unidadeMedida = sc.next().charAt(0);



	    if(unidadeMedida == 'F'  || unidadeMedida == 'f')
	    {
	    	System.out.print("Digite a temperatura em Fahrenheit: ");
	        temperatura = sc.nextDouble();
	        temperaturaConvertida = (5.0/9.0)* (temperatura - 32.0);
	        unidadeResposta = "celsius";
	        unidadeMedidaResposta = 'C';

	    }
	    else if(unidadeMedida == 'C'  || unidadeMedida == 'c')
	    {
	    	System.out.print("Digite a temperatura em Celsius: " );
	    	temperatura = sc.nextDouble();
	        temperaturaConvertida = temperatura * 1.8 + 32;
	        unidadeResposta = "fahrenheit";
	        unidadeMedidaResposta = 'F';
	    }
	    else
	    {
	        unidadeResposta = "Conversão impossivel para unidade informada";

	    }
	    sc.close();

	    if(unidadeResposta == "Conversão impossivel para unidade informada")
	    {
	    	System.out.println(unidadeResposta );
	    }
	    else
	    {
	        
	    	System.out.print("Temperatura equivalente em " + unidadeResposta + " : " + String.format("%.2f", temperaturaConvertida) + "°" + unidadeMedidaResposta );
	    }

	}

}
