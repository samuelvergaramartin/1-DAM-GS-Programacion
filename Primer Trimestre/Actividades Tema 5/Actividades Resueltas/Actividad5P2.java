/**
 * @author Samuel Vergara Martín
 */
import java.util.*;
public class Actividad5P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0,numeros[];
        numeros = new int[5];

        mode(2, num, sc, numeros);
    }
    static void mode(int type,int num, Scanner sc, int numeros[]) {
        for(int i = 0; i<numeros.length; i++) {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
            numeros[i] = num;
        }

        if(type == 1) {
            for(int i : numeros) {
                System.out.print(i + " ");
            }
        }
        if(type == 2) {
            for(int i = 0; i<numeros.length; i++) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}