package estruturasDeControle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Informe a m�dia: ");
		double media = leitor.nextDouble();
		//criando um intervalo
		/*se o valor de m�dia for menor ou igual a 10
		 * e se m�dia for maior ou igual a 7*/
		if(media <= 10 && media >= 7.0) {
			System.out.println("Aprovado!");
			System.out.println("Parab�ns!");

		}
		/*se m�dia for menor que 7 e se media for
		 * maior ou igual a 4.5*/
		if(media < 7 && media >= 4.5) {
			System.out.println("Recupera��o");
		}
		/*se media for menor e maior ou igual a 0*/
		if(media < 4.5 && media >= 0) {
			System.out.println("Reprovado");
			
		}
		/*se media for maior ou igual a 11*/
		if(media >= 11) {
			System.out.println("Essa nota n�o existe!");
		}
		
		leitor.close();

	}

}
