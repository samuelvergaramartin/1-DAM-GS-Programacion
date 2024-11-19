package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numSecreto, num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Generando número...");

        numSecreto = (int) ((Math.random() * 100) + 1);

        System.out.print("Introduce el número secreto: ");
        num = sc.nextInt();

        if(num < numSecreto) System.out.println(num + " es menor que el número secreto.");
        else if (num > numSecreto) System.out.println(num + " es mayor que el número secreto.");

        while (num != numSecreto && num != -1) {
            System.out.print("Introduce el número secreto: ");
            num = sc.nextInt();

            if(num < numSecreto && num != -1) System.out.println(num + " es menor que el número secreto.");
            else if (num > numSecreto) System.out.println(num + " es mayor que el número secreto.");
        }

        if(num != -1) System.out.println("¡Enhorabuena! Has acertado el número secreto");

        System.out.println("Fin del juego");
    }
    
}
