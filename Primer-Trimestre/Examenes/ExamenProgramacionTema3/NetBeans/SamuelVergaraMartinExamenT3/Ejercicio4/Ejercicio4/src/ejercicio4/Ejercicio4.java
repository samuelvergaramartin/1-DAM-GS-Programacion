package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int altura;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduzca la altura de la pirámide: ");
            altura = sc.nextInt();
        }
        while (altura < 1 || altura > 10);

        //Bucle que controla las filas de la pirámide
        for(int i = 1; i <= altura; i++) {

            //Bucle para controlar los espacios
            for(int x = 1; x <= (altura -i); x++) {
                System.out.print(" ");
            }

            for(int x = 1; x <= i; x++) {
                if(i == 1) System.out.print(x);
                else {
                    int centro = x;
                    int limit= x -1;
                    System.out.print(x);
                    if(x == i) System.out.print(x);
                }
            }

            System.out.println();
        }
    }
    
}
