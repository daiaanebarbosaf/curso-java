package estruturasDeControle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		
		String valor = JOptionPane.showInputDialog(
				"Informe o número:");
		//transformando String em número
		int numero = Integer.parseInt(valor);
		
		//saber se um número é par ou não
		if(numero % 2 == 0) {
			System.out.println("Número par!");
		}else {
			System.out.println("Número ímpar");
		}

	}

}
