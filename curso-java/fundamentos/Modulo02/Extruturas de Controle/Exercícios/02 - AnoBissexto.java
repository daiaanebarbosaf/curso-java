package EstruturasControle.Exercícios;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		int ano = leitor.nextInt();
		
		int bissexto = ano % 4;
		
		if(bissexto == 0) {
			
			System.out.println(ano + " é um ano bissexto");
			
		} else {
			
			System.out.println( ano + " não é um ano bissexto");
			
		}
		
		leitor.close();
		
	}

}
