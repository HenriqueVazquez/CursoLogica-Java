package curso_programacao;

import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		String nome;
	    double valorHora, pagamento;
	    int horasTrabalhadas;
	    
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Nome: ");
	    nome = sc.nextLine();
	    System.out.print("Valor por hora: ");
	    valorHora =  sc.nextDouble();
	    System.out.print("Horas trabalhadas: ");
	    horasTrabalhadas = sc.nextInt();
	    sc.close();

	    pagamento = (double) valorHora * horasTrabalhadas;

	    
	    System.out.println("O pagamento para " + nome + " deve ser R$ " + String.format("%.2f", pagamento ));

	}

}
