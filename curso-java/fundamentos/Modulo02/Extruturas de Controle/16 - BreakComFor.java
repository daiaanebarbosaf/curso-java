package EstruturasControle;

public class Break {

	public static void main(String[] args) {
			
		for(int i = 0; i < 10; i++) {
			/*a repetição vai parar quando o contador
			 * for igual a 5*/
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Fim!");
	}

}
