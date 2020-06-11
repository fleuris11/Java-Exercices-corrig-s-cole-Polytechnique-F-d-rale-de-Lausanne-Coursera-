
class Shell
{
	public static void main(String[] args)
    {
      int[] tab = { 3, 5, 12, -1, 215, -2, 17, 8, 3, 
                      5, 13, 18, 23, 5, 4, 3, 2, 1    };
      System.out.println("A trier  : ");
      affiche(tab);
      triShell(tab);
      System.out.println("Résultat :");
      affiche(tab);
    }
  
  static void affiche(int[] tab)
    {
		for(int el : tab) {
		  System.out.print(el +  " ");
		}
		
      System.out.println();
    }
  

  // inverse le contenu des cases d'indices index1 et index2
  // du tableau tab
  static void swap(int[] tab, int index1, int index2)
    {
      int temp = tab[index1];
      tab[index1] = tab[index2];
      tab[index2] = temp;
    }
  
  
  static void triShell(int[] tab)
    {
      for(int k = (tab.length)/2; k >= 1; k /= 2)
        for (int i = k+1; i <= tab.length; ++i) {
          int j = i-k;
          while (j > 0) {
            if (tab[j-1] > tab[j+k-1]) {
				swap(tab, j-1, j+k-1);
              j -= k;
            } else {
              j = 0;
            }
          }
        }
    }
}
