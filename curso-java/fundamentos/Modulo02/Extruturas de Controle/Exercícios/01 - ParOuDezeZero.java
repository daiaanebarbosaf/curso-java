/*1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;*/

package EstruturasControle.Exercícios;

import java.util.Scanner;

public class ParOuDezeZero {

	public static void main(String[] args) {
		
		Scanner  leitor = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double numero = leitor.nextDouble();
		
		if(numero <= 10 && numero >= 0) {
			
			System.out.printf("Número: %.1f está entre 10 e 0.\n", numero);
			
		}else {
			System.out.printf("Número: %.1f não está entre 10 e 0\n", numero);
		}
		
		if (numero % 2 == 0) {
			System.out.printf("Número: %.1f é Par.\n", numero);
		}else {
			System.out.printf("Número: %.1f é Ímpar.\n", numero);
		}
		
		leitor.close();

	}

}
