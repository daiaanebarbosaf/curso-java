package EstruturasControle.Exerc�cios;

import java.util.Scanner;

public class ParOuDezeZero {

	public static void main(String[] args) {
		
		Scanner  leitor = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		double numero = leitor.nextDouble();
		
		if(numero <= 10 && numero >= 0) {
			
			System.out.printf("N�mero: %.1f est� entre 10 e 0.\n", numero);
			
		}else {
			System.out.printf("N�mero: %.1f n�o est� entre 10 e 0\n", numero);
		}
		
		if (numero % 2 == 0) {
			System.out.printf("N�mero: %.1f � Par.\n", numero);
		}else {
			System.out.printf("N�mero: %.1f � �mpar.\n", numero);
		}
		
		leitor.close();

	}

}
