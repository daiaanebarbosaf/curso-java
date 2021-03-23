package EstruturasControle;

public class Continue {

	public static void main(String[] args) {
		
		for(int i = 0; i < 3; i++) {
			
			/*ele vai executar o código inteiro até I ser igual
			 * a 2, quando ele chega no 2 para e volta para a
			 * comparação, assim não mostrando o 2*/
			if (i == 2) {
				continue;
			}
			System.out.println(i);
		}

	}

}
