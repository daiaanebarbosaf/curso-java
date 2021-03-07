package ex;

import java.util.Scanner;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = leitor.nextDouble();
		
		double temperatura = fahrenheit * 1.8 + 32;
		
		System.out.println("Temperatura em Graus Celsius: " + temperatura + "°C");
		
		leitor.close();

	}

}
