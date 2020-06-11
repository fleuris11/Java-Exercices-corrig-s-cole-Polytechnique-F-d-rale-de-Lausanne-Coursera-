import java.util.Scanner;

class Age {

	public static void main(String[] args) {
		final int ANNEE_COURANTE = 2016;

		System.out.println("Donnez votre age : ");

		Scanner input = new Scanner(System.in);

		int age = input.nextInt();

		int annee = ANNEE_COURANTE - age;


		System.out.println("Votre annee de naissance est : " + annee);
	}
}
