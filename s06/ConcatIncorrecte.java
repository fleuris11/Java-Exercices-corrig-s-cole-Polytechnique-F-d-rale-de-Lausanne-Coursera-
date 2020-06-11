class ConcatIncorrecte {

	public static void main(String[] args) {
		String s = "China Blue";
		System.out.println(s);
		//version incorrecte
		//concatener(s, " Express");

		// version correcte:
		s = concatener(s, " Express");
		System.out.println(s);
	}

	/*
	 * les raisons du comportement incorrect sont que:
	 * 1. les opérations sur les chaines sont non destructives
	 *(créent une autre chaine au lieu d'agir sur la chaine originale)
	 * 2. l'objet s est une référence, mais les référence sont passées
	 * par valeur (on peut altérer l'objet référencé, mais pas la référence
	 * elle même):
	 * + crée une nouvelle chaine
	 * la référence de cette nouvelle chaine est affectée  s
	 * (on essaie de changer la référence s et l'effet de cette modification n'est que local)
	 * (revoir l'exemple du cours "méthode auxilliaires et réutilisabilité" avec
	 * les tableaux)
	 */

	/*
	 * version incorrecte
	public static void concatener(String s,String s2 )
		{
			s += s2;
		}
	*/
	
	// version corrigée
	public static String concatener(String s,String s2 ) {
		s += s2;
		return s;
	}
}
