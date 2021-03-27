package EstruturasControle.Exercícios;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		
		double n1 = leitor.nextDouble();
		double n2 = leitor.nextDouble();
		
		double media = (n1 + n2)/2.0;
		
		if(media >= 7.0) {
			System.out.println("Aprovado");
		} else
		
		if(media < 7.0 && media > 4.0) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		leitor.close();
		
	}

}
