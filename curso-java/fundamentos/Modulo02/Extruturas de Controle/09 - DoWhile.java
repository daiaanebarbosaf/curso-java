package EstruturasControle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		//if(...) sentença; ou {}
		//while(...) sentença; ou {}
		//for(...;...;...) senteça; ou {}
		/*do sentença; ou {} while (...); executa
		 * pelo menos uma vez, diferente do while
		 * que se for o caso nem precisa executar */
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			
			System.out.println("Você precisa falar "
					+ "as palavras mágicas: ");
			System.out.println("Quer sair? ");
			
			texto = entrada.nextLine();
			
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado e Fim!");
		
		entrada.close();
	}

}
