package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		//A String não é uma palavra reservada
		String s = "Bom dia X";
		System.out.println(s);
		
		/*Aqui podemos substituir valores*/
		s = s.replace("X", "Senhora");
		
		/* aqui transformamos a String toda em letra 
		maiuscula*/
		s = s.toUpperCase();
		System.out.println(s);
		
		/*Como contatenar*/
		s = s.concat("!!!");
		System.out.println(s);
		
		//outra forma de usar os pontos
		
		System.out.println("Leo teacher".concat(", como vai?"));
		System.out.println("Leo teacher".toUpperCase());
		System.out.println("Leo teacher".replace("teacher", "professor"));
	}
	
}
