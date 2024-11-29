package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        boolean omirp;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        numero = sc.nextInt();

        omirp = esOmirp(numero);

        System.out.println(numero + ": " + omirp);
    }
    
    private static boolean esOmirp(int num) {
        int numInvertido = 0;
        boolean omirp = false;

        if(esPrimo(num)) {
            //Damos la vuelta al número
            while(num > 0) {
                if(numInvertido != 0) numInvertido*=10;

                numInvertido+= num%10;
                num/= 10;
            }

            if(esPrimo(numInvertido)) omirp = true;
        }

        return omirp;
    }

    private static boolean esPrimo(int num) {
        int contador = 0;
        boolean primo = false;

        for(int i = num; i > 0; i--) {
            if(num % i == 0) contador++;
        }


        if(contador == 2) primo = true;

        return primo;
    }
    
}
