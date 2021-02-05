package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		/*mostrando o conteudo do indice que escolher
		 * Nesse caso a� est� mostrando o conte�do do
		 * �ndice 2*/
		System.out.println("Ol� Pessoal".charAt(2));
		
		/*Nas Strings o valor inicial n�o pode ser mudado
		 * o que acontece � uma substitui��o de valores com o
		 * .toUpperCase()*/
		String s = "Boa tarde";
		
		/*Para concatenar, ou seja acrescentar algo,
		 * tanto faz colocar o .concat ou simplesmente o +,
		 * far�o o mesma coisa*/
		System.out.println(s.concat("!!!"));
		//or
		System.out.println(s + "!!");
		
		/*Aqui iremos testar se come�a com palavra (boa) na String*/
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		
		/*.toLowerCase() n�o desconsidera se est� mai�scula 
		 * ou n�o*/
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		/*Aqui iremos testar se no fim tem a palavra (dia!) na String*/
		System.out.println(s.endsWith("tarde"));
		
		/*para saber quantos caracteres tem uma String*/
		System.out.println(s.length());
		
		/*Para comparar igualdade entre valores da String*/
		System.out.println(s.equals("boa Tarde"));
		/*Para comparar igualdade entre valores da String,
		 * mas aqui ela ignora se est� com letras mai�sculas ou
		 * n�o*/
		System.out.println(s.equalsIgnoreCase("boa Tarde"));
		
		//\n para quebrar linha
		
		/*Como imprimir o valor das vari�veis de um jeito mais 
		 * simples*/
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.printf("Nome: %s %s, tem %s e o sal�rio de: R$ %.2f.\n", 
		nome, sobrenome, idade, salario);
		
		/*para saber se tem tal palavra na frase*/
		System.out.println("Frase qualquer".contains("qual"));
		
		/*para saber qual o indice*/
		System.out.println("Frase qualquer".indexOf("qual"));
		
		/*quando quiser mostrar um conteudo apartir de um
		 * indice*/
		System.out.println("Frase qualquer".substring(6));
		
		/*esse aqui voc� tbm pode escolher onde parar*/
		System.out.println("Frase qualquer".substring(6, 10));
	
	}

}
