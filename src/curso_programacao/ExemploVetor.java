package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVetor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N, i;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		N = sc.nextInt();
		sc.close();
		
		double[] vet = new double[N];
		
		for (i = 0; i < N; i++) {
		System.out.print("Digite um numero: ");
		vet[i] = sc.nextDouble();
		sc.close();
		}
		
		System.out.println("\nNUMEROS DIGITADOS:");
		for (i = 0; i < N; i++) {
		System.out.println(String.format("%.1f", vet[i]));
		}
		
	
		}
}
