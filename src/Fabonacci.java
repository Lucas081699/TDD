public class Fabonacci {

    int test( int x) {
         int resultat = 1;
         if (x < 0) {
           return -1;
         }
         if (x > 500000)   {
          return -1;
         }
        for (int i = 1; i <= x; i++) {
            resultat = resultat * i;
        }       return resultat;


    }
}
