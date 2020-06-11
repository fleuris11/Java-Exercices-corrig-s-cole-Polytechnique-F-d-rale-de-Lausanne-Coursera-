import java.util.ArrayList;

class DynamicArray2 {
	public static void main(String[] args) {
		ArrayList<Integer> tab1 = new ArrayList<Integer>();
		tab1.add(99);
		tab1.add(1);
		tab1.add(0);

		ArrayList<Integer> tab2 = new ArrayList<Integer>();
		for(int i=0; i < tab1.size(); ++i) {
			tab2.add(tab1.get(0));
		}
	}
}
