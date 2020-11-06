import java.util.Arrays;

public class Fase2 {

	public static void main(String[] args) {
		
		recorrerArray(creaArrayCiutats());

	}
	
	/**
	 * Agafem les variables de la Fase1 i creem un array que les tindrà a dins.
	 * @return arrayCiutats.
	 */
	private static String[] creaArrayCiutats() {
		
		String ciutat1 = "Barcelona";
		String ciutat2 = "Madrid";
		String ciutat3 = "Valencia";
		String ciutat4 = "Malaga";
		String ciutat5 = "Cadis";
		String ciutat6 = "Santander";
		
		String[] arrayCiutats = new String [6];
		
		arrayCiutats[0]=ciutat1;
		arrayCiutats[1]=ciutat2;
		arrayCiutats[2]=ciutat3;
		arrayCiutats[3]=ciutat4;
		arrayCiutats[4]=ciutat5;
		arrayCiutats[5]=ciutat6;
		
		return arrayCiutats;
		
	}
	
	/**
	 * Ordenem l'array alfabèticament, el recorrem amb un for each i el mostrem en consola.
	 * @param arrayCiutats
	 */
	private static void recorrerArray(String[] arrayCiutats) {

		Arrays.sort(arrayCiutats);

		for (String nomCiutats : arrayCiutats) {
			System.out.println(nomCiutats);
		}

	}

}
