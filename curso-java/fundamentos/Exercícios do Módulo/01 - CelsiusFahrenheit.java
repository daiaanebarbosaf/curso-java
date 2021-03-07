package ex;

import java.util.Scanner;

public class CelsiusFahrenheit {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = leitor.nextDouble();
		
		double temperatura = (celsius - 32) / 1.8;
		
		System.out.println(" Temperatura em Fahrenheit é: "  + temperatura +  " ° F " );

		leitor.close();

	}

}
