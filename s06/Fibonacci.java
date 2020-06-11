import java.util.Scanner;

class Fibonacci
{
   private static Scanner clavier = new Scanner(System.in);
   
   public static void main(String[] args) {
		 char rep;
         do {
            int n = demanderNombre(0, 40);
            System.out.println("Méthode itérative :");
            System.out.println("    F(" + n + ") = " + FibonacciIteratif(n));
			System.out.println("Méthode récursive :");
            System.out.println("    F(" + n + ") = " + Fibonacci(n));

            
            do {
               System.out.print("Voulez-vous recommencer [o/n] ? ");
               rep = clavier.next().charAt(0);
            } while ((rep != 'o') && (rep != 'n'));

         } while (rep == 'o');
      }
   


/* ----------------------------------------------------------------------
 * Calcule de façon itérative le n-ieme nombre de Fibonacci.
 * Entrée : le nombre n 
 * Sortie : F(n)
 * ---------------------------------------------------------------------- */
   static int FibonacciIteratif(int n)
      {
         int Fn = 0;    // stocke F(i)  , initialisé par F(0)
         int Fn_1 = Fn; // stocke F(i-1), initialisé par F(0)
         int Fn_2 = 1;  // stocke F(i-2), initialisé par F(-1)
         
         for (int i = 1; i <= n; ++i) {
            Fn   = Fn_1 + Fn_2;    // pour n>=1 on calcule F(n)=F(n-1)+F(n-2)
            Fn_2 = Fn_1;           // et on decale...
            Fn_1 = Fn;
         }
         return Fn;
      }
 
/* ----------------------------------------------------------------------
 * Calcule de façon récursive le n-ieme nombre de Fibonacci.
 * Entrée : le nombre n 
 * Sortie : F(n)
 * ---------------------------------------------------------------------- */
   static int Fibonacci(int n)
      {
         if (n == 0)
            return 0;
         else if (n == 1)
            return 1;
         else
            return Fibonacci(n-1) + Fibonacci(n-2);
      }
 
/* --------------------------------------------------------------
 * fonction demandant à l'utilisateur un nombre compris
 * dans un intervalle [a, b], ou supérieur ou égal à a
 * si b < a.
 * Entrée : les deux nombres a et b définissant l'intervalle
 * Sortie : le nombre saisi par l'utilisateur
 * -------------------------------------------------------------- */
   static int demanderNombre(int a, int b)
      {
		  int res;
         do {
            System.out.print("Entrez un nombre entier ");
            if (a >= b){
               System.out.print("supérieur ou égal à " + a);
            }
            else {
               System.out.print("compris entre " + a + " et " + b);
            }
      
            System.out.print(" : ");
            /* La lecture de la valeur au clavier est ici délibérément simplifiée
			   on ne traite pas les situations où l'utilisateur se trompe 
			   au moment de la saisie*/
            res =  clavier.nextInt(); 
         } while ((res < a) || ((a < b) && (res > b)));
 
         return res;
      }
}

 