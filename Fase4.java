
public class Fase4 {

	public static void main(String[] args) {
		String ciutat1 = "Barcelona";
		String ciutat2 = "Madrid";
		String ciutat3 = "Valencia";
		String ciutat4 = "Malaga";
		String ciutat5 = "Cadis";
		String ciutat6 = "Santander";

		// Agafem els caràcters i creem un array per cada ciutat.

		char[] charsCiutat1 = extreureChars(ciutat1);
		char[] charsCiutat2 = extreureChars(ciutat2);
		char[] charsCiutat3 = extreureChars(ciutat3);
		char[] charsCiutat4 = extreureChars(ciutat4);
		char[] charsCiutat5 = extreureChars(ciutat5);
		char[] charsCiutat6 = extreureChars(ciutat6);

		revertirArray(charsCiutat1);
		revertirArray(charsCiutat2);
		revertirArray(charsCiutat3);
		revertirArray(charsCiutat4);
		revertirArray(charsCiutat5);
		revertirArray(charsCiutat6);

	}

	/**
	 * Convertim les variables String en arrays de caràcters.
	 * 
	 * @param nom
	 * @return array
	 */
	private static char[] extreureChars(String nom) {
		char[] array = new char[nom.length()];

		for (int i = 0; i < nom.length(); i++) {

			array[i] = nom.charAt(i);

		}

		return array;

	}

	/**
	 * Recorrem l'array a l'inrevés per a poder revertir-lo i li donem format per
	 * treure'l per consola.
	 * 
	 * @param array
	 */
	private static void revertirArray(char[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
		}

		System.out.println();
	}

}
