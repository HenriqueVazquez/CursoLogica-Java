package curso_programacao;

import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {
		double precoProduto, quantidade, pagamento, troco;

		Scanner sc = new Scanner(System.in);

		System.out.println("Caixa:");
		System.out.print("Preco unitário do produto: ");
		precoProduto = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextDouble();
		System.out.print("Dinheiro recebido: ");
		pagamento = sc.nextDouble();
		sc.close();
		
		troco = pagamento - precoProduto * quantidade;

		System.out.println("troco = R$ " + String.format("%.2f", troco));

	}

}
