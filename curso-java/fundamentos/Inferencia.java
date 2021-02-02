package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5; //declara��o e inicializa��o da vari�vel
		System.out.println(a);
		
		/**
		 * Inferencia � quando voc� n�o
		 * coloca o tipo de vari�vel e
		 * o pr�prio programa reconhece 
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
		 * uma vari�vel e depois voc� querer mudar 
		 * n�o � possivel, pois essa j� foi previamente
		 * inferida como String
		 * Ex:
		 * c = 4.5;
			System.out.println(c);*/
		
		double d; //vari�vel for declarada
		d = 123.65; //variavel foi inicializada
		System.out.println(d);// usada, foi impresso o valor
	
		
	}

}
