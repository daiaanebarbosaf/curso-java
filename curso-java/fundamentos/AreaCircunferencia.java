package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args ) {
		
		double raio = 3.4;
		final double pi = 3.14159; //para transformar em constante sendo assim não é possivel atribuir um novo valor
		
		double area = pi * raio * raio;
		
		System.out.println(pi * raio * raio);
		System.out.println("Área = " + area + "m2.");
		
	}

}
