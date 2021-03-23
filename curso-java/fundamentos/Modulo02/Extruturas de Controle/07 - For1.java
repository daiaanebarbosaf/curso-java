package EstruturasControle;

public class For1 {

	public static void main(String[] args) {
		
		/*int contador = 0;
		
		while (contador <= 10) {
			
			System.out.println("Bom dia!");
			contador++;
		}*/
		
		
		for(int contador = 0; contador<= 10; contador ++) {
			
			System.out.println("contador = " + contador);
		}
		
		//exemplo de decrementar
		for(contador = 10; contador >= 0; contador --) {
			System.out.println("i = " + contador);
		}
		
				/*com o for não é necessário definir as três partes:*/
		int x = 2;
		for(; x < 10;) {
			System.out.println("x = " + x);
			x++;
		}
		
	}

}
