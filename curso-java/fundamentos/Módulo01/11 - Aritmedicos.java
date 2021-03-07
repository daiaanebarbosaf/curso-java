package fundamentos;

public class Aritimemeticos {

	public static void main(String[] args) {
		
		var x = 35.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		//outra forma de transformar a variavel em outro tipo
		System.out.println(a / (double)b);
		System.out.println(a / (float)b);
		
		//como extrair o resto da divisão
		System.out.println(a % (double) b);
		
		System.out.println(x + y - a * b);
		

	}

}
