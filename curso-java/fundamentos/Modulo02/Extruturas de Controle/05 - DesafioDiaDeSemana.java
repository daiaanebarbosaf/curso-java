package estruturasDeControle;

import java.util.Scanner;

public class DesafioDiaDeSemana {

	public static void main(String[] args) {
		
		/*Digite domigo e a saída será = 1;
		 * Digite Segunda e a saída será = 2;
		 * Digite Terça e a saída será = 3...*/
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite Um dia da Semana: ");
		
		String diaDaSemana = leitor.next();
		
		if(diaDaSemana.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		} 
		
		else if(diaDaSemana.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		}
		
		else if(diaDaSemana.equalsIgnoreCase("terça")) {
			System.out.println("3");
		} 
		
		else if(diaDaSemana.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		} 
		
		else if(diaDaSemana.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		} 
		
		else if(diaDaSemana.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		} 
		
		else if(diaDaSemana.equalsIgnoreCase("sabado")) {
			System.out.println("7");
		} else {
			System.out.println("Dia Inválido");
		}
		
		leitor.close();
	}

}
