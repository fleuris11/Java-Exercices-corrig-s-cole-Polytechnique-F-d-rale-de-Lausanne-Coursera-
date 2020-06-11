import java.util.Scanner;

class Pascal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int size = 0;

		// On demande la taille
		System.out.println("Taille du triangle de Pascal : ");
		size = scanner.nextInt();

		// Ici on déclare le tableau, mais on ne construit que la première
		// dimension
		int[][] triangle = new int[size][];

		// On construit et initialise la 1ère ligne
		triangle[0] = new int[1];
		triangle[0][0] = 1;

		for (int row = 1; row < size; row++) {

			// Chaque ligne du triangle est un tableau à une dimension
			// dont la taille est celle de la ligne precedente + 1:
			// on construit ces lignes (new) au fur et à mesure que l'on
			// progresse dans le tableau
			triangle[row] = new int [triangle[row - 1].length + 1];

			// Remplissage du tableau:
			// les deux éléments aux deux extrémités des lignes valent 1.
			// Les autres sont liés par la relation:
			// triangle[row][j]= triangle[row-1][j-1] + triangle[row-1][j]

			for (int col = 0; col <= row; col++) {
				if ((col == 0) || (col == row)) {
					triangle[row][col] = 1;
				} else {
					triangle[row][col] = triangle[row - 1][col - 1]
							+ triangle[row - 1][col];
				}
			}
		}

		// Affichage du tableau
		for (int row = 0; row < size; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print(triangle[row][col] + " ");
			}
			System.out.println();
		}

		scanner.close();
	}
}
