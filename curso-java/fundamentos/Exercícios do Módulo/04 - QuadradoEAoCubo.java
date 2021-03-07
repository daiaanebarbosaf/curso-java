package ex;

import java.util.Scanner;

public class QuadradoEAoCubo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double valor = leitor.nextDouble();
		
		double aoQuadrado = valor * valor;
		double aoCubo = Math.pow(valor, 3);
		
		System.out.println("Valor Ao Quadrado: " + aoQuadrado);
		System.out.println("Valor Ao Cubo: " + aoCubo);
		
		leitor.close();
	}

}
