package fundamentos;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 97; //na base hexadecimal A equivale a 97
		int b = 'a';
		
		//comparação entre as duas variáveis
		System.out.println(a == b);
		
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
		double nota2 = 3.3;
		boolean bomComportamento2 = true;
		boolean passouPorMedia2 = nota2 >= 7;
		boolean temDesconto2 = bomComportamento2 && passouPorMedia2;
		
		System.out.println("Tem desconto? " + temDesconto2);
		
		double nota3 = 8.3;
		boolean bomComportamento3 = false;
		boolean passouPorMedia3 = nota3 >= 7;
		boolean temDesconto3 = bomComportamento3 && passouPorMedia3;
		
		System.out.println("Tem desconto? " + temDesconto3);
	}

}
