import java.util.Scanner;

class Formules {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		// message
		System.out.print("Entrez un nombre réel : ");
		// déclaration et lecture de x
		double x = clavier.nextDouble();

		double resultat = 0.0;

		// Expression 1
		System.out.print("Expression 1 : ");
		if (x == 0.0) {
			System.out.println("indéfinie");
		} else {
			resultat = x / (1.0 - Math.exp(x));
			System.out.println(resultat);
		}

		// Expression 2
		System.out.print("Expression 2 : ");
		if ((x <= 0.0) || (x == 1.0)) {
			System.out.println("indéfinie");
		} else {
			resultat = x * Math.log(x) * Math.exp(2.0 / (x-1.0)) ;
			System.out.println(resultat);
		}

		// Expression 3
		System.out.print("Expression 3 : ");
		if ( (x > 0.0) && (x < 8.0) ) {
			System.out.println("indéfinie");
		} else {
			resultat = (-x - Math.sqrt(x * x - 8.0 * x) ) / (2.0 - x) ;
			System.out.println(resultat);
		}

		// Expression 4
		System.out.print("Expression 4 : ");
		if ((x <= 1.0 ) && (x >= 0.0)) {
			System.out.println("indéfinie");
		} else {
			resultat = (Math.sin(x) - x / 20.0) * Math.log(Math.sqrt(x * x - 1.0 / x));
			if (resultat < 0.0) {
				System.out.println("indéfinie");
			} else {
				System.out.println(Math.sqrt(resultat));
			}
		}

		clavier.close();
	}
}
