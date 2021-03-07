package ex;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite o valor da base do triangulo: ");
		double valorBase = leitor.nextDouble();
		System.out.println("Digite o valor da altura do triangulo: ");
		double valorAltura = leitor.nextDouble();
		
		double areaTriangulo =(valorBase * valorAltura)/2;
		
		System.out.println("Valor da Área do Triângulo: " + areaTriangulo);
		
		leitor.close();
	}

}
