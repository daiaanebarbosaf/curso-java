package fundamentos;
/*Criar uma classe chamada DESAFIO CONVERSÃO 
 * com Scanner, vai pegar 3 Strings usando 
 * NEXTLINE  e essas 3 Strings vão receber 
 * os ultimos três sálarios de um funcionário. 
 * Na entrada,  podesse separar com vírgula 
 * ou com ponto. Por fim calcule a média desses 
 * 3 salários.*/

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
	
		
		String salario1 = leitor.nextLine();
		
		/*para aceitar tanto ponto como virgula,
		 * o replace está substiuindo a virgula pelo
		 * ponto.*/
		salario1 = salario1.replace(',', '.');
		
		String salario2 = leitor.nextLine();
		salario2 = salario2.replace(',', '.');
		
		String salario3 = leitor.nextLine();
		salario3 = salario3.replace(',', '.');
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);
		
		double media = (s1 + s2 + s3) / 3;
		
		System.out.println(media);
		
		leitor.close();
	}

}
