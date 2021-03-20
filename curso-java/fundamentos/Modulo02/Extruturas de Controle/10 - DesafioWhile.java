package EstruturasControle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while (nota != -1) {
			System.out.println("Informe a nota: ");
			nota = leitor.nextDouble();
			
			if(nota <=10 && nota >= 0) {
				/*aqui os valores armazenados em NOTA estão
				 * sendo somados um com o outro, cada valor que
				 * entra é somado com o anterior e o valor dessa
				 * soma é armazenado na variável TOTAL*/
				total += nota;
				/*essa variável está pegando a quantidade
				 * de vezes que as notas estão sendo digitadas
				 * pelo usuário*/
				quantidadeDeNotas++;
			} else if ( nota != -1){
				System.out.println("Nota Inválida!!! ;D");
			}
			
		}
		
    //calculando a média
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);
		
		leitor.close();

	}

}
