/*3. Criar um programa que receba duas notas parciais, calcular a média final. 
Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se 
a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", 
caso contrário imprime no console "Reprovado".*/

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
