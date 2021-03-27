//4. Criar um programa que receba um número e diga se ele é um número primo.
package EstruturasControle.Exercícios;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número: ");

		int contador = 0;
		
		int numero = leitor.nextInt();
		
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				contador++;
			}
		}
		
		if (contador == 0) {
			System.out.println("É primo.");
		} else {
			System.out.println("Não é primo");
		}
		
		leitor.close();

	}

}
