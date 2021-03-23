package fundamentos;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("Resultado sem .equals(): ");
		System.out.println("2" == "2");
		
		System.out.println("comparando com uma variável "
		+ "com o memo valor:");
		String s1 = new String("2");
		System.out.println("2" == s1);
		
		System.out.println("comparando apenas com o conteudo:");
		System.out.println("2".equals(s1));
	

	}

}
