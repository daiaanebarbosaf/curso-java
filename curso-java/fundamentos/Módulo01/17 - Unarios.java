package fundamentos;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; //a = a + 1
		a--; //a = a - 1
		
		++b; //b = b + 1
		--b; //b = b + 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);/*Pela ordem de
		Prescedência vai somar +1 na variável a antes
		de se comparar com b--, por isso o resultado dará
		TRUE*/
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}

}
