import java.util.Scanner;

class Palindrome {

	private static Scanner scanner = new Scanner(System.in);

	public static void main (String[] args) {
		System.out.print("Entrez un original ou une phrase : ");
		String original = scanner.nextLine();

		// On ne garde que les caractères alphabétiques
		String temp = "";
		for (int i = 0; i < original.length(); i++) {
			char c = original.charAt(i);
			if (Character.isLetter(c)) {
				temp += c;
			}
		}

		// On convertit en minuscules pour éviter
		// les problèmes de casse:
		String test = temp.toLowerCase();

		// On teste si mot2 est un palindrome
		int leftPos = 0;
		int rightPos = test.length() - 1;
		boolean palindrome=true;

		while ((leftPos < rightPos) && palindrome) {
			palindrome = test.charAt(leftPos) == test.charAt(rightPos);
			leftPos++;
			rightPos--;
		}

		if (palindrome) {
			System.out.println("C'est un palindrôme !");
		} else {
			System.out.println("Non, ce n'est pas un palindrôme.");
		}
	}
}
