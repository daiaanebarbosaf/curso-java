package estruturasDeControle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		//comando para aparecer uma janela para digitar
		String valor = JOptionPane.showInputDialog(
				"Informe o número:");
		//transformando String em número
		int numero = Integer.parseInt(valor);
		
		/*saber se um número é par ou não
		se o resultado for 0 é par, se o resultado
		for 1 é ímpar*/
		if(numero % 2 == 0) {
			System.out.println("Número par!");
		}else {
			System.out.println("Número ímpar");
		}

	}

}
