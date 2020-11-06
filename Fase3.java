import java.util.Arrays;

public class Fase3 {

	public static void main(String[] args) {
		
		String[] ciutatsModificades = modificarArray(creaArray());
		
		recorrerArray(ciutatsModificades);

	}

	/**
	 * Posem les ciutats en variables i les emmagatzemem en un array.
	 * @return arrayCiutats.
	 */
	private static String[] creaArray() {

		String ciutat1 = "Barcelona";
		String ciutat2 = "Madrid";
		String ciutat3 = "Valencia";
		String ciutat4 = "Malaga";
		String ciutat5 = "Cadis";
		String ciutat6 = "Santander";

		String[] arrayCiutats = new String[6];

		arrayCiutats[0] = ciutat1;
		arrayCiutats[1] = ciutat2;
		arrayCiutats[2] = ciutat3;
		arrayCiutats[3] = ciutat4;
		arrayCiutats[4] = ciutat5;
		arrayCiutats[5] = ciutat6;
		
		Arrays.sort(arrayCiutats);

		return arrayCiutats;

	}

	/**
	 * Creem un nou array per les ciutats modificades, i canviem les a per 4.
	 * @param arrayCiutatsModificades
	 */
	private static String[] modificarArray(String[] arrayCiutats) {
		
		String[] arrayCiutatsModificades = new String [6];
		
		for (int i=0; i < arrayCiutats.length; i++) {
			
			arrayCiutatsModificades[i] = arrayCiutats[i].replace('a','4');
			
		}
		
		return arrayCiutatsModificades;

	}
	
	/**
	 * Recorrem l'array i el mostrem per consola.
	 * @param arrayCiutatsModificades
	 */
	private static void  recorrerArray(String[] arrayCiutatsModificades) {
		
		for (String nouNom : arrayCiutatsModificades) {
			
			System.out.println(nouNom);
		}
		
	}

}
