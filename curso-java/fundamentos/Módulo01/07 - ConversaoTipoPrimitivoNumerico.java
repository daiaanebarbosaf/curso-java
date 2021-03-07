pacote fundamentos;

// O java só ANALISA TIPOS e não valor

public class ConversaoTipoPrimitivoNumerico {

	public static void main (String [] args) {
		
		/ * Exemplo de Conversão Implicita, ou seja,
		 * do maior * /
		double a = 1.123456788888;
		System.out.println (a);
		
		// Exemplo Conversão Explícita e Cast
		float b = (float) 1.123456788888;
		System.out.println (b);
		
	}
	
}
