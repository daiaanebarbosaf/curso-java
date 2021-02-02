package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5; //declaração e inicialização da variável
		System.out.println(a);
		
		/**
		 * Inferencia é quando você não
		 * coloca o tipo de variável e
		 * o próprio programa reconhece 
		 * e exibe o valor de acordo com
		 * as caracteristicas do valor.
		 * Exemplo a baixo:
		 */
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Inferiu tipo String";
		System.out.println(c);
		
		c = "Inferiu tipo String Outro Texto";
		System.out.println(c);
		
		/*Se foi definido um determinado valor para
		 * uma variável e depois você querer mudar 
		 * não é possivel, pois essa já foi previamente
		 * inferida como String
		 * Ex:
		 * c = 4.5;
			System.out.println(c);*/
		
		double d; //variável for declarada
		d = 123.65; //variavel foi inicializada
		System.out.println(d);// usada, foi impresso o valor
	
		
	}

}
