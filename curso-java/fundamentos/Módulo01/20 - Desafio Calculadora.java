package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = leitor.nextDouble();
		System.out.println("\nDigite o segundo número: ");
		double num2 = leitor.nextDouble();
		System.out.println("\nDigite o operador: ");
		String operador = leitor.next();
		
		
		/*COMO EU FIZ
		 * boolean conta = operador == "+";
		
		int resultado = num1 + num2;
		
		System.out.println("O Resultado da sua Conta é: " 
		+ resultado);*/
		
		/*boolean contasubtracao = operador == "-";
		
		int resultado = num1 - num2;
		
		System.out.println("O Resultado da sua Conta é: " 
		+ resultado);*/
		
		/*boolean contamultiplicação = operador == "*";
		
		int resultado = num1 * num2;
		
		System.out.println("O Resultado da sua Conta é: " 
		+ resultado);*/
		
		/*boolean contadivisao = operador == "/";
		
		double resultado = num1 / num2;
		
		System.out.println("O Resultado da sua Conta é: " 
		+ resultado);
		
		boolean contaresto = operador == "%";
		
		double resultado = num1 % num2;
		
		System.out.println("O Resultado da sua Conta é: " 
		+ resultado);*/
		
		//COMO REALMENTE É kk muito mais simples
		
		double resultado = "+".equals(operador) ? num1 + num2 : 0;
		resultado = "-".equals(operador) ? num1 - num2 : resultado;
		resultado = "*".equals(operador) ? num1 * num2 : resultado;
		resultado = "/".equals(operador) ? num1 / num2 : resultado;
		resultado = "%".equals(operador) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, resultado);
		
		
		leitor.close();
		
		
	}

}
