import java.util.Scanner;

class MulMat {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int lignes = 0;
		int colonnes = 0;

		// Saisie de la 1ère matrice
		System.out.println("Saisie de la 1ere matrice :");

		// On vérifie que le nombre de lignes est plus grand que 0
		while (lignes < 1) {
			System.out.print("Nombre de lignes : ");
			lignes = scanner.nextInt();
		}

		// On vérifie que le nombre de colonnes est plus grand que 0
		while (colonnes < 1) {
			System.out.print("Nombre de colonnes : ");
			colonnes = scanner.nextInt();
		}

		// Déclaration-construction de la 1ère matrice
		double[][] mat1 = new double[lignes][colonnes];
		for (int row = 0; row < lignes; row++) {
			for (int col = 0; col < colonnes; col++) {
				System.out.print("  M[" + (row + 1) + "," + (col + 1) + "]=");
				mat1[row][col] = scanner.nextDouble();
			}
		}


		// ... et on refait la même chose pour la 2ème matrice
		lignes = 0;
		colonnes = 0;

		System.out.println("Saisie de la 2eme matrice :");
		while (lignes < 1) {
			System.out.print("Nombre de lignes : ");
			lignes = scanner.nextInt();
		}

		while (colonnes < 1) {
			System.out.print("Nombre de colonnes : ");
			colonnes = scanner.nextInt();
		}

		double[][] mat2 = new double[lignes][colonnes];
		for (int row = 0; row < lignes; row++) {
			for (int col = 0; col < colonnes; col++) {
				System.out.print("  M[" + (row + 1) + "," + (col + 1) + "]=");
				mat2[row][col] = scanner.nextDouble();
			}
		}

		// Ici on multiplie les matrices
		if (mat1[0].length != mat2.length) {
			System.out.println("Multiplication de matrices impossible !");
		} else {
			// Déclaration-construction de la matrice résultat
			double[][] prod = new double[mat1.length][mat2[0].length];
			for (int row = 0; row < mat1.length; row++) {
				for (int col = 0; col < mat2[0].length; col++) {
					prod[row][col] = 0.0;
					for (int i = 0; i < mat2.length; i++) {
						prod[row][col] += mat1[row][i] * mat2[i][col];
					}
				}
			}

			// Affichage du résultat
			System.out.println("Resultat :");
			for (int row = 0; row < prod.length; row++) {
				for (int col = 0; col < prod[row].length; col++) {
					System.out.print(prod[row][col] + " ");
				}
				System.out.println();
			}
		}

		scanner.close();
	}
}
