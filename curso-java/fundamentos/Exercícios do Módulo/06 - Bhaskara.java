package ex;

public class Bhaskara {

	public static void main(String[] args) {

		int a = 1;
		int b = 12;
		int c = -13;
		
		int calculo1 = (int) Math.pow(b, 2);
		int calculo2 = calculo1 - ((4 * a) * c);
		
		System.out.println("Valor de Delta: " + calculo2);
		

	}

}
