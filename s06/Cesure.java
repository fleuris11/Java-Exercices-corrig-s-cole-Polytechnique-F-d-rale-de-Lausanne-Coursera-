import java.util.Scanner;

class Cesure {

	public static void main(String[] args) {
		String[] phrase = lirePhrase();
		System.out.println("Le résultat est : ");
		for (int i = 0; i < phrase.length; i++) {
			cesure(phrase[i]);
		}
	}

	/**
	 * Lit une phrase depuis le terminal.
	 * @return un tableau de Strings où chaque entrée
	 * est un mot de la phrase lue.
	 */ 
	static String[] lirePhrase() {
		Scanner scanner = new Scanner(System.in);
		
		int number = 0;
		while (number <= 0) {
			System.out.print("Donnez le nombre de mots de votre phrase : ");
			number = scanner.nextInt();
			if (number <= 0) {
				System.out.println("Entrez une valeur plus grande que 0");
			}
		}

		String[] phrase = new String [number];

		// se debarasser du \n 
		scanner.nextLine();
		for (int i = 0; i < number; i++) {
			System.out.print("Donnez le mot " + (i + 1) + " : ");
			phrase[i] = scanner.nextLine();
		}

		scanner.close();
		
		return phrase;
	}

	/**
	 * Réalise la césure pour un mot donné.
	 * Pour ce faire, examine les différentes façons de couper
	 * le mot: entre l'indice debut et l'indice i et entre i et 
	 * la longueur du mot (i variant de 1 à la longueur du mot et 
	 * debut étant initialisé à 0).
	 * Si la régle de césure s'applique à ces deux parties
	 * afficher le "-" et passer à la ligne suivante.
	 * Puis, faire le même traitement en considérant la portion de mot
	 * entre i et longueur du mot (debut prend la valeur de i)
	 * @param mot une String représentant un mot de la phrase
	 */ 
	static void cesure(String mot) {
		int debut = 0;
		for (int i = 1; i < mot.length(); i++) {
			char c1 = mot.charAt(i - 1);
			char c2 = mot.charAt(i);
			if ((voyelle(c1) && !voyelle(c2))) {
				String s1 = mot.substring(debut, i);
				String s2 = mot.substring(i, mot.length());
				if ((s1.length() > 1) && (s2.length() > 1)) {
					if (!(queVoyelles(s1) || queVoyelles(s2))) {
						System.out.println(s1 + "-");
						debut = i;
					}
				}
			}
		}

		String s1 = mot.substring(debut, mot.length());
		System.out.println(s1);
	}

	/**
	 * Teste si un caractère est une voyelle.
	 * @param c le caractère à tester
	 * @return true si c est une voyelle et false sinon
	 */ 
	static boolean voyelle(char c) {
		return ((c == 'a') ||
					(c == 'e') ||
					(c == 'i') ||
					(c == 'o') ||
					(c == 'u') ||
					(c == 'y'));
	}

	/**
	 * Teste si une chaîne de caractères ne contient que des voyelles.
	 * @param s la chaîne à tester
	 * @return true si s ne contient que des voyelles et false sinon
	 */ 
	static boolean queVoyelles(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!voyelle(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
