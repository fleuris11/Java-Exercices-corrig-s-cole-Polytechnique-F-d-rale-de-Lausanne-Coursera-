import java.util.ArrayList;

class DynamicArray1 {

	public static void main(String[] args) {
		final int TAILLE = 10;
		ArrayList<Integer> tab = new ArrayList<Integer>();
		for (int i = 0; i < TAILLE; ++i) {
			tab.add(tab.size());
		}
	}
}
