import java.util.Scanner;

public class Fase1 {

	public static void main(String[] args) {

		// Creació de 6 Strings buits.

		String ciutat1 = "";
		String ciutat2 = "";
		String ciutat3 = "";
		String ciutat4 = "";
		String ciutat5 = "";
		String ciutat6 = "";

		// Inicialització d'scanner i introducció de les ciutats a les variables
		// anteriors.

		Scanner scannerCiutats = new Scanner(System.in);
		System.out.println("Introdueix 6 ciutats.");

		ciutat1 = scannerCiutats.next();
		ciutat2 = scannerCiutats.next();
		ciutat3 = scannerCiutats.next();
		ciutat4 = scannerCiutats.next();
		ciutat5 = scannerCiutats.next();
		ciutat6 = scannerCiutats.next();

		// Creació de variable d'emmagatzematge i sortida per consola.

		String totalCiutats = ciutat1 + ", " + ciutat2 + ", " + ciutat3 + ", " + ciutat4 + ", " + ciutat5 + ", "
				+ ciutat6;

		System.out.println("Les ciutats són: " + totalCiutats + ".");

		// Tancament d'scanner.

		scannerCiutats.close();
	}

}
