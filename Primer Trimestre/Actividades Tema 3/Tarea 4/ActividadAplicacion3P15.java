/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadAplicacion3P15 {
    public static void main(String[] args) {
        int n,e = 0,nFact,mFact,nMenosMFact;
        //n = numero de filas
        //m = numero de columnas
        // E = cada uno de los numeros que estan en la piramide
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor de n: ");
        n = sc.nextInt();

        for(int i = 0; i <= n; i++) {
            nFact = factorial(i);
            for(int j = 0; j <= i; j++) {
                mFact = factorial(j);
                nMenosMFact = factorial(i-j);
                e = nFact / (mFact * nMenosMFact);
                System.out.print(e + " ");
            }
            System.out.println("");
        }

        sc.close();
        System.exit(0);
    }
    private static int factorial(int numero) {
        int value = 1;
        for(int i = 1; i <= numero; i++) {
             value *= i; 
        }
        return value;
    }
}
